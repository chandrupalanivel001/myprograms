import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Integration {
    public static void main(String[] args) throws IOException {
        String output = null;
        int index_start, index_end, s_no, current_s_no = 0;
        boolean is_connected = false,exist =false;
        File file = new File("Raw-data.txt");
        Scanner input = new Scanner(System.in);
        String[] argv = new String[4];
        System.out.print("Enter the IP Address : ");
        argv[0] = input.next();
        System.out.print("Enter the reg type : ");
        argv[1] = input.next();
        System.out.print("Enter the starting reg : ");
        argv[2] = input.next();
        System.out.print("Enter the number of reg to read : ");
        argv[3] = input.next();
        if(!exist){
            exist = file.createNewFile();
        }
        FileWriter wr = new FileWriter("Raw-data.txt");
            //wr.write(new_str);


            /*if (argv.length < 4) {
                System.out.println("usage: java test3 dns_name unit reg_no num_regs");
                System.out.println("eg java test3 ipaddress 5 0 10");
                return;
            }*/


                String ip_adrs = argv[0];
                int unit = Integer.parseInt(argv[1]);
                int reg_no = Integer.parseInt(argv[2]);
                int num_regs = Integer.parseInt(argv[3]);
                System.out.println("ip_adrs = " + ip_adrs + " unit = " + unit + " reg_no = " +
                        reg_no + " num_regs = " + num_regs);
                while (true) {
                    try {
                        Socket es = new Socket(ip_adrs, 502);
                        boolean connected = es.isConnected();
                        if (connected && !is_connected) {
                            System.out.println("connected");
                            is_connected = true;
                        }
                        OutputStream os = es.getOutputStream();
                        InputStream In = es.getInputStream();
                        FilterInputStream the = new BufferedInputStream(es.getInputStream());
                        FilterInputStream is = new BufferedInputStream(es.getInputStream());
                        byte obuf[] = new byte[261];
                        byte ibuf[] = new byte[261];
                        int c = 0;
                        int i;
                        for (i = 0; i < 5; i++) obuf[i] = 0;
                        obuf[5] = 6;
                        obuf[6] = (byte) unit;
                        obuf[7] = 3;
                        obuf[8] = (byte) (reg_no >> 8);
                        obuf[9] = (byte) (reg_no & 0xff);
                        obuf[10] = (byte) (num_regs >> 8);
                        obuf[11] = (byte) (num_regs & 0xff);


                        os.write(obuf, 0, 12);

                        i = is.read(ibuf, 0, 261);
                        if (i < 9) {
                            if (i == 0) {
                                System.out.println("unexpected close of connection at remote end");
                            } else {
                                System.out.println("response was too short - " + i + " chars");
                            }
                        } else if (0 != (ibuf[7] & 0x80)) {
                            System.out.println("MODBUS exception response - type " + ibuf[8]);
                        } else if (i != (9 + 2 * num_regs)) {
                            System.out.println("incorrect response size is " + i +
                                    " expected" + (9 + 2 * num_regs));
                        } else {
                            try {
                                output = new String(ibuf, StandardCharsets.US_ASCII);
                                index_start = output.indexOf("START");
                                index_end = output.indexOf("END");
                                s_no = Integer.parseInt(output.substring(index_start - 4, index_start));
                                if (current_s_no != s_no) {
                                    System.out.println("serial No = " + s_no);
                                    System.out.println("Read String = " + output.substring(index_start - 4, index_end + 3));
                                    String new_str = output.substring(index_start - 4, index_start+3);
                                    try {
                                        wr.append(new_str);
                                    }
                                    catch (Exception e){
                                        System.out.println("not writeable");
                                    }
                                    //boolean is_wr_able = file.setWritable(true);
                                    current_s_no = s_no;
                                }

                            }
                            catch (StringIndexOutOfBoundsException e) {
                                System.out.print("");
                            }

                        }

                        es.close();
                    } catch (Exception e) {
                        System.out.println("exception :" + e);
                    }
                }

        //input.close();
    }
}

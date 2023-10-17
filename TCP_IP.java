import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class TCP_IP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = 0;
        System.out.print("Enter the IP Address : ");
        String ip_address = in.next();
        System.out.print("Enter The Port Number : ");
        int port_number = in.nextInt();
        if (ip_address != "" & port_number != 0) {
            while (option < 3) {
                try {
                    Socket socket = new Socket(ip_address, port_number);
                    if (socket.isConnected()) {
                        System.out.print("1.Read\n2.Write\n3.exit\n");
                        System.out.print("Select the option : ");
                        option = in.nextInt();
                        if (option == 1) {
                            InputStream inputStream = socket.getInputStream();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                            String data = bufferedReader.readLine();
                            System.out.println(data);
                            //socket.close();
                            bufferedReader.close();
                            option = 0;
                        } else if (option == 2) {
                            OutputStream outputStream = socket.getOutputStream();
                            PrintWriter out = new PrintWriter(outputStream, true);
                            System.out.print("Enter the send Data : ");
                            String send_data = in.next();
                            out.println(send_data);
                           //socket.close();
                            out.close();
                            option = 0;
                        }
                        else if (option > 3) {
                            option = 0;
                            socket.close();
                            System.out.println("Enter the correct option!");
                        }
                    }
                    else {
                        System.out.println("Not Connected!");
                    }
                } catch (IOException e) {
                    System.out.println(e + "");

                }
            }
        }
        else{
            System.out.println("incorrect option");
            return;
        }
    }
}

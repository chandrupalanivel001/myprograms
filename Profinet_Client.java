import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Profinet_Client {
   private Socket socket;
    public  Profinet_Client(String Ip, int port) throws IOException{
        this.socket = new Socket(Ip, port);
    }
    public void sendData(byte[] data) throws IOException {
        socket.getOutputStream().write(data);
    }

    public byte[] receiveData(int length) throws IOException {
        byte[] data = new byte[length];
        socket.getInputStream().read(data);
        return data;
    }

    public void close() throws IOException {
        socket.close();
    }
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String IP = input.next();
        int Port = input.nextInt();
        Profinet_Client client = new Profinet_Client(IP, Port);
       // PlcDriver Driver =  PlcDriverManager.getDriver(ProfinetDriver.NAME);


    }
}

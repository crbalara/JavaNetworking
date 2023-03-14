import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        while (true) {
            try {

                ServerSocket ss = new ServerSocket(8090);
                System.out.println("running");


                while (true) {
                    Socket s = ss.accept();
                    System.out.println("connected to Client");
                    InetSocketAddress socketAddress =(InetSocketAddress) s.getRemoteSocketAddress();
                    System.out.println(socketAddress);
                    String ClientAddress = socketAddress.getAddress().getHostAddress();
                    System.out.println(ClientAddress);


                    DataOutputStream dop = new DataOutputStream(s.getOutputStream());
                    Scanner sc = new Scanner(System.in);
                    DataInputStream dip = new DataInputStream(s.getInputStream());
                    while (true) {
                        String value = dip.readUTF();
                        System.out.println(value);
                        if(value.equals("disconnect"))
                        {
                            System.out.println("client is disconnected");
                            break;
                        }


                        String name = sc.nextLine();

                        dop.writeUTF(name);


                    }


                }
            } catch (Exception e) {

            }
        }
    }
}




import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {
                try {

                    Socket s = new Socket("localhost", 8080);
                    System.out.println("connect to server0");


                    while (true) {

                        DataInputStream dip = new DataInputStream(s.getInputStream());
                        Scanner sc1 = new Scanner(System.in);
                        DataOutputStream dop = new DataOutputStream(s.getOutputStream());
                while(true) {
                    String st = sn.nextLine();

                    System.out.println(st);
                    if  (st.equals("bye")) {
                        break;
                    }

                        while(true) {

                            System.out.println(dip.readUTF());
                            String name = sc1.nextLine();
                            dop.writeUTF(name);


                            if (name.equals("disconnect")) {
                                s.close();
                            }
                        }
                    }*/

                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

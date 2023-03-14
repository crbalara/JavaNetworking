import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        while (true)
        {
        Scanner st = new Scanner(System.in);
        System.out.println("type connect for connect to server and Type disconnect for disconnect to server");
        String start = st.nextLine();
        if (start.equals("connect")) {

            try{

                Socket s = new Socket("10.68.98.157", 8000);
                System.out.println("connect to server0");


                while (true) {

                    DataInputStream dip = new DataInputStream(s.getInputStream());
                    Scanner sc1 = new Scanner(System.in);
                    DataOutputStream dop = new DataOutputStream(s.getOutputStream());
                /*while(true) {
                    String st = sn.nextLine();

                    System.out.println(st);
                    if  (st.equals("bye")) {
                        break;
                    }*/

                 while(true) {


                     String name = sc1.nextLine();
                     dop.writeUTF(name);
                     if (name.equals("disconnect")) {
                         s.close();
                     }
                     System.out.println(dip.readUTF());
                 }
                }

            } catch (Exception e) {
            }
        }
        }
    }
}

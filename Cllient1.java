import java.net.*;
import java.io.*;
public class Cllient1 {
    public static void main(String[] args) {
        try {
                Socket s = new Socket("10.68.98.201", 8080);
                System.out.println("connected to server2");
            while (true);
        }
        catch (Exception e)
        {
        }
    }
}


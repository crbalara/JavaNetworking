import java.net.*;
import java.io
        .*;
public class Client2 {
    public static void main(String[] args) {
        try {
                Socket s = new Socket("10.68.98.201",8080);
                System.out.println("connected to server2");
        }
        catch (Exception e)
        {
        }
    }
}

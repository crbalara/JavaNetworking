import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {

        try {
            ServerSocket sr = new ServerSocket(8050);
            System.out.println("Server Running.......");

            Socket s = sr.accept();
            System.out.println("Client connected!!");

            InetSocketAddress socketAddress = (InetSocketAddress) s.getRemoteSocketAddress();
            System.out.println(socketAddress.getAddress());


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


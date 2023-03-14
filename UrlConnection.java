import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
class FileWrite
{
    void createf()
    {
        try {
            File f = new File("C:\\Users\\91876\\Desktop\\Html4.txt");
            if(f.createNewFile())
            {
                System.out.println("file"+f.getName()+"created successfully");
            }
            else {
                System.out.println("file already Exists");
            }
        }
        catch (Exception ee)
        {
            System.out.println(ee);
        }


    }

    void writef(String val) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\91876\\Desktop\\Html4.txt", true);
           fw.write(val);
           fw.close();
        }
        catch (Exception ef)
        {
            System.out.println(ef);
        }
    }
}

public class UrlConnection {
    public static void main(String[] args) {

        FileWrite f =new FileWrite();
        f.createf();


        try
        {
            URL url = new URL("https://www.google.co.in");
           // URLConnection con = url.openConnection();
           // System.out.println(con.getContent());
            HttpURLConnection urlcon =(HttpURLConnection)url.openConnection();
            urlcon.setRequestMethod("GET");

            InputStreamReader in = new InputStreamReader(urlcon.getInputStream());
            BufferedReader bf = new BufferedReader(in);
            String st ="";
            while (st!=null) {
                st = bf.readLine();
                System.out.println(st);
             f.writef(st);


            }
            bf.close();
           /* for(int i=0;i<=8;i++)
            {
                System.out.println(urlcon.getHeaderFieldKey(i));
                System.out.println(urlcon.getHeaderField(i));
            }
            urlcon.disconnect();



            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getFile());*/

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

import java.io.*;
import java.net.*;
public class NetworkDemo {
 public static void main(String[] args) throws IOException
 {
         {
        InetAddress myaddr = InetAddress.getLocalHost();
        System.out.println("My ip is:"+ myaddr.getHostAddress());
        System.out.println("My hostname is:"+ myaddr.getHostName());

        } 
}
}
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;


public class domainIP {
    public static void main(String[] args) throws IOException {
        InetAddress myaddr = InetAddress.getByName("https://www.example.com");
        System.out.println(myaddr.getHostAddress());

    }
}

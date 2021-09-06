import java.net.*;
import java.io.*;
public class Client {
     public static void main(String[] args) {
         try {
             
         
         Socket client = new Socket("localhost",5000);
         System.out.println("Client has started...");

        BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String str = userinput.readLine();
        PrintWriter out =new PrintWriter(client.getOutputStream(),true);
        out.println(str);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        System.out.println(in.readLine());
    }
    catch (Exception e) {
        System.out.println(e);
    }
}
}
 

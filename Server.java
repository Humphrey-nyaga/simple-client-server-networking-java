import java.net.*;
import java.io.*;
public class Server {
    public static void main (String [] args) {
      try {
        
       
        System.out.println("Waiting for client...");
      ServerSocket server= new ServerSocket(5000);
      Socket client = server.accept();
      System.out.println("Client connected");

      BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
      String str = in.readLine();
      PrintWriter out =new PrintWriter(client.getOutputStream(),true);
      out.println( str.toUpperCase());

    }
  
    catch (Exception e) {
      //TODO: handle exception
    }
}
}

 
import java.net.*;
 import java.io.*; 
 public class ContentGetter {  
      public static void main (String[] args) {  
             if  (args.length > 0) {       //Open the URL for reading     
                  try { 
    URL u = new URL("www.example.com"); 
            try { 
      Object o = u.getContent(); 
      System.out.println("I got a " + o.getClass().getName()); 
    } // end try
    catch (IOException e) { 
      System.err.println(e); 
    }       } // end try 
  catch (MalformedURLException e) { 
    System.err.println(args[0] + " is not a parseable URL"); 
  } 
} //  end if 
} // end main 
}  // end ContentGetter 

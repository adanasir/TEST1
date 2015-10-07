/**
 *
 * @author adanasir
 */
package test1q1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.PrintWriter;


public class test1q1 {
   
        public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
              
        String p = "Name: Siti Aminah Shuhada Mat Nasir. Matrix No.: 2014433638. Gender: Female. Age: 32 years old. E-mail: adanasir@gmail.com. Mobile Phone: 0199171336";
        byte[] buffer = p.getBytes();
        
        StringBuilder binary = new StringBuilder();
        for (byte b : buffer){
            int val = b;
            for (int a = 0; a < 8; a++)
            {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');      
        }
              
        //System.out.println("'" + p + "'to binary" + binary);
        
        try (
        PrintWriter writer = new PrintWriter("C:/Users/Administrator/Desktop/adanasirjava.bin", "UTF-8")) {
             //writer.println("'" + p + "'" + " to binary = " + binary);
             writer.println(binary);
        }
    }
}
/**
 * Test 1 question 2
 * @author adanasir
 */
package textfiles;

import java.io.IOException;


public class FileData {
    public static void main(String[] args) {
       String file_name = "C:/Users/Administrator/Desktop/adanasirjava.bin";

       try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();
               
            int a;
            for (a=0; a < aryLines.length; a++){
                System.out.println(aryLines[a]);
            }
        }  
        catch (IOException e) {
           System.out.println( e.getMessage());
       }
    }
}

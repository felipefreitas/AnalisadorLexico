package analisadorlexico;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe Freitas
 */
public class AnalisadorLexico {

    public static void main(String[] args) {
        String sourcePath = args[0];
        
        try {
            Scanner sourceFile = new Scanner(new FileReader(sourcePath));
            StringBuilder sb = new StringBuilder();
            
            while(sourceFile.hasNext()){
                sb.append(sourceFile.next());
            }
            
            sourceFile.close();
            String result = sb.toString();
            System.out.println(result);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

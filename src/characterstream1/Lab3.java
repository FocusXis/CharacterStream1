/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterstream1;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class Lab3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(50.5);
            output.println(175.0);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try { 
            String s;
            FileReader file = new FileReader("data.txt");
           BufferedReader input = new BufferedReader(file);
            while ((s = input.readLine()) != null){
                System.out.println((s));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

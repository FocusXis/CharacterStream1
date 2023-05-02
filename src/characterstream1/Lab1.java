package characterstream1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Lab1 {
    public static void main(String[] args) {
         try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World!");
            output.write(" Welcome to JAVA");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            int ch;
            FileReader input = new FileReader("data.txt");
            while ((ch = input.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
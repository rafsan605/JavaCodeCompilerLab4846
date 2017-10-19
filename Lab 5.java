/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tukitaki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NewClass1 {
public static String[] key = {"if", "else", "while", "int", "float", "double", "for"};
//you will have more arrays like this here.
    public static String token="";
    public static void main(String[] args) throws FileNotFoundException {
        //file
            File f = new File("file_path");
            //read each line
            Scanner inputLine = new Scanner(f);
            //for each line
            System.out.println("Keys :");
            while (inputLine.hasNextLine()) {
                //take a line
                String line = inputLine.nextLine();
                
                //tokenize
                StringTokenizer strToken = new StringTokenizer(line);
                while (strToken.hasMoreTokens()) {
                    token = strToken.nextToken();
               
                    String[] r = token.split("\\r?\\n");
                    for(int i=0;i<r.length;i++) {
                    for(int j=0;j<key.length;j++) {
                    if(key[j].equals(r[i])) {
                  System.out.println(key[j]);
                    
                    }
                    }
                    
                    }
                }
            }
    }               
}
    
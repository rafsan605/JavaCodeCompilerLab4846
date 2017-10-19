/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tukitaki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class lab1 {
    public static final String FileName = "E:\\test\\new.txt";
     public static void main(String[] args) {
          
         String line=null;
         String lul = null;
         BufferedReader br = null;
         FileReader fr = null;
         try {
         fr = new FileReader(FileName);
         br = new BufferedReader(fr);
         String key = "(int|float|if|else|double)";
         String iden = "(a|b|c|d|e|f|x|y|z)";
         String mat = "(+|-|/|=|*)";
         String log = "(>|<|>=|<=)";
         String num = "(1.0|2.0|3.0|4.0|5.0|6.0|7.0|8.0|9.0|0.0)";
         String oth = "({}|()|,|:|;)";
         System.out.println("Key :");
       Pattern patt = Pattern.compile(key);
        while((line = br.readLine()) != null)
        {  Matcher m = patt.matcher(line);
           while (m.find()) {
           int start = m.start(0);
           int end = m.end(0);
        String Key[] = {line.substring(start, end)};
          System.out.println(Arrays.toString(Key));
     }
        }
    }
        catch (IOException e) {
	e.printStackTrace();
   }
}
}

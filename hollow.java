/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tukitaki;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class hollow {
  public static void main(String[] args) {
 System.out.println("Enter the number height : ");
 Scanner s = new Scanner(System.in);
 int height = s.nextInt();
      //int height = 10;  
 
      for ( int i=1 ; i<=height ; i++ ) {
         for ( int j=1 ; j <= i ; j++ ) {
            if(i==1 || i==2 || i==height || j==1 | j==i)
              System.out.print("*");
            else 
              System.out.print(" ");
         }
         System.out.println();
      }
   }
}
 
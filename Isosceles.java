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

public class Isosceles
{

 public static void main(String[] args)
 {
  Scanner scn=new  Scanner(System.in);
  System.out.println("Enter Size for pyramid");
  int len=scn.nextInt();
  
  for(int i=1;i<=len;i++)
  {
   for(int j=0; j<len-i;j++)
   {
       System.out.print(" ");
   }
   for(int k=1;k<=i;k++)
   {
    System.out.print("* ");
   }
   
   System.out.println();
  }
 }
}

import java.util.Scanner;

public class righttriangle
{

 public static void main(String[] args)
 {
  Scanner scn=new  Scanner(System.in);
  System.out.println("Enter Size for pyramid");
  int len=scn.nextInt();
  
  for(int i=1;i<=len;i++)
  {
   for(int j=len; j>i;j--)
   {
       System.out.print(" ");
   }
   for(int k=1;k<=i;k++)
   {
    System.out.print("*");
   }
   
   System.out.println();
  }
  
  

 }

}
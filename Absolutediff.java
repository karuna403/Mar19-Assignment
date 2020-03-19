import java.lang.*;
 import java.util.Scanner;
 import java.util.InputMismatchException;
 

       public class Absolutediff {

   public static void main(String[] args) {
       
      // get some integers to find their absolute values
      
      try{
      System.out.println("enter  input numbers:");
      Scanner sc=new Scanner(System.in);
      
       int x=sc.nextInt();
      int y=sc.nextInt();
      
      if(x>0 && y>0){
      int c=x-y;
     int a=Math.abs(c);
      System.out.println("absolute difference is:"+a);
      }
      else if(x<0||y<0){
          System.out.println("enter Positive numbers only");
      }
      
      }catch(InputMismatchException e){
          System.out.println("enter only numbers");
      }
      }
      }

      
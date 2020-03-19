 class Overload
{
   public int  myMethod(int num1, int num2)
   { 
       int c=num1+num2;
       System.out.println("result="+c);
       return c;
   }
   public int myMethod(int var1, int var2, int var3)
   {
       int r=var1+var2+var3;
       System.out.println(r);
       return r;
   }
}
public class Sum 
{
   public static void main(String args[])
   {
       Demo obj1= new Demo();
       obj1.myMethod(10,10,10);
       obj1.myMethod(20,12);
   }
}
       
      
    
    
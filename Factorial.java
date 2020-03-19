import java.util.Scanner;
public class Factorial {
    public static int factorial(int n) {
        int fact=1;
    if (n == 0) {
        return 1;
    }
    
    for(int i=1;i<=n; i++){
      fact=fact*i;
     
     
}
System.out.print("fact="+fact);

return fact;
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
     factorial(a);
    }
}
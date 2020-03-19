import java.util.Scanner;
public class Nextchar {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int x=(int)ch;
      int y=3;
      int c=x+y;
      char ch1=(char)c;
      System.out.println(ch1);
}
}
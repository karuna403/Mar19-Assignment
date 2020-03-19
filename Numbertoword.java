import java.util.Scanner;
import java.util.InputMismatchException;

public class Numbertoword {



        public static void main(String[] args) {
            try{
            int number = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type a number between 0 and 99 OR type -1 to exit:  ");
            number = scanner.nextInt();
            
                if(number==0){
                        System.out.println("NUMBER AFTER CONVERSION:\tZERO");
                    }
                else if(number>=0 && number<=99){
                     
                        System.out.println("NUMBER AFTER CONVERSION:\t");
                       
                        numberToWord((number % 100), " ");
                    }

                else{
                    System.out.print("number can't be negetive");
                }
                
        }catch(InputMismatchException e){
            System.out.println("only numbers are allowed");
        }
        }
        

        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE"
            };
            String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
            if (num > 19) {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {
                System.out.print(val);
            }
        
        }
}

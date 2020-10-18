import java.util.Scanner;

public class Palindrome {
    public static void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number<10000 || number>=100000){
            System.err.println("Wrong number!!!\n");
            return;
        }
        int d1 = number % 10;
        int d2 = (number / 10) % 10;
        int d4 = (number / 1000) % 10;
        int d5 = (number / 10000) % 10;

        boolean isPalindrome = d1 == d5 && d2 == d4;
        System.out.printf("It is %s a palindrome.", isPalindrome?"":"not");
    }
}

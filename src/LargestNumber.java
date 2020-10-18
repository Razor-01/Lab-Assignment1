import java.util.Scanner;

public class LargestNumber {
    public static void start(){
        int counter;
        double number=0.00000;
        double largest=0.00000;
        double largest1=0.00000;
        double smallest=0.00000;

        for (counter=0;counter<10;counter++){
            Scanner one = new Scanner(System.in);

            number = one.nextDouble();
            if (counter == 0)
            {
                smallest = number;
            }

            if (number>largest){
                largest1=largest;
                largest= number;
            }
            else if(number< smallest){
                smallest=number;
            }
        }

        System.out.printf("Enter 10 numbers:\n"+"number= %.3f",number);
        System.out.printf("The largest number: %.3f\n",largest );
        System.out.printf("The second largest numberL %.3f\n", largest1);
        System.out.printf("The smallest number: %.3f\n",smallest );

    }
}

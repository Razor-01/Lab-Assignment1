import java.util.Scanner;

public class BMI {
    public static void start(){
        Scanner objOne = new Scanner(System.in);
        Scanner objTwo = new Scanner(System.in);
        double weight;
        double height;

        System.out.println("Enter your weight in kilograms");
        weight = objOne.nextDouble();
        System.out.println("Enter your height in meters");
        height = objTwo.nextDouble();

        double BMI;
        BMI = weight / (height*height);

        String category = "";
         if (BMI<18.5){
             category="Underweight";
         }else if(BMI >=18.5 && BMI<=24.9){
            category="Normal";
         }else if (BMI>=25 && BMI<=29.9){
             category="Overweight";
         }else if(BMI>=30){
             category="Obese";
        }
        System.out.println("Your BMI Index is:" +BMI);
        System.out.println("your BMI Index show that you are in " + category +" category\n");
         System.out.println("             BMI Values:\n" +
                "Underweight:  less than 18.5\n" +
                "Normal:       between 18.5 and 24.9\n" +
                "Overweight:   between 25 and 29.9\n" +
                "Obese:        30 or greater\n");
    }
}

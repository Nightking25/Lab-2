import java.util.Scanner;

/*
  This program convert the given weight in pounds and height in feet to kgs and
  meters.Then, it calculates the BMI of the user.
*/
public class Question2 {

      public static void main(String[] args) {

            System.out.println("\n                ************************        ");
            System.out.println("                *    BMI CALCULATOR    *");
            System.out.println("                ************************        ");

            Scanner scanner = new Scanner(System.in);
            double bmi, wtInLbs, htInFt, wtInKg, htInM;

            final double KG_FACTOR, M_FACTOR;

            KG_FACTOR = 2.205;
            M_FACTOR = 3.281;

            System.out.println("Enter your weight in lbs.");
            wtInLbs = scanner.nextDouble();

            System.out.println("Enter your height in feet.");
            htInFt = scanner.nextDouble();

            htInM = htInFt / M_FACTOR;
            wtInKg = wtInLbs / KG_FACTOR ;
            bmi = wtInKg / ( Math.pow ( htInM , 2 ));


            System.out.printf("You are %f kg.",wtInKg);
            System.out.printf("You are %f meters tall.", htInM);
            System.out.printf("Your BMI is %f", bmi);

      }
}

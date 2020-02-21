import java.util.Scanner;

//Practicing with Arrays
public class Question4extra {
      public static void main(String[] args) {
            double[] tempList = new double[3];//list for temperature
            double avgTemp, total;
            Scanner sc = new Scanner(System.in);
            int i, j;

            System.out.println("\n                ********************************");
            System.out.println("                *    Average Temp in 3 Days    *");
            System.out.println("                ********************************");

            total = 0;
            j = 1;
            // Adding inputs to the list with for loop
            for (i = 0; i<3; i++) {
              System.out.printf("\nInput temperature no.%d: ", j=+1);
              tempList[i] = sc.nextDouble();
              total = tempList[i] + total;
            }

            System.out.printf("\nThe average temperature of 3 days was: %.2f degree celsius", total/3);

      }
}

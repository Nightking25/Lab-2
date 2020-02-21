import java.util.Scanner;

//Solving question 3
public class Question4 {
      public static void main(String[] args) {
            double temp1,temp2, temp3;
            double avgTemp, total;
            Scanner sc = new Scanner(System.in);

            System.out.println("\n                ********************************");
            System.out.println("                *    Average Temp in 3 Days    *");
            System.out.println("                ********************************");

            System.out.print("\nEnter the first temperature: ");
            temp1 = sc.nextDouble();

            System.out.print("\nEnter the second temperature: ");
            temp2 = sc.nextDouble();

            System.out.print("\nEnter the third temperature: ");
            temp3 = sc.nextDouble();

            total = temp1 + temp2 + temp3;

            System.out.printf("\nThe average temperature of 3 days was: %.2f degree celsius", total/3);

      }
}

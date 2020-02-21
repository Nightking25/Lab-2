import java.util.Scanner;

public class Question3 {
      public static void main(String[] args) {
            int minutes, seconds;

            Scanner input = new Scanner(System.in);


            System.out.println("\n                *************************************");
            System.out.println("                *    Seconds to Minutes Converter   *");
            System.out.println("                *************************************");

            System.out.println("Type the total amount of seconds: ");

            int totalSeconds = input.nextInt();

            minutes = totalSeconds / 60;
            seconds = totalSeconds % 60;

            System.out.printf("%nIt is %d minutes and %d seconds.", minutes, seconds);
      }
}

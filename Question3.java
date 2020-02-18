import java.util.Scanner;

public class Question3 {
      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Type the amount of seconds: ");

            int totalSeconds = input.nextInt();

            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;

            System.out.printf("%nThe requested output is %d:%d%n", minutes, seconds);
      }
}

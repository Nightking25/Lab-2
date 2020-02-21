import java.util.*;

public class Question5{

      public static void main(String[] args) {
            int commaPosition;

            Scanner input = new Scanner(System.in);

            System.out.println("\n                **************************************");
            System.out.println("                *    Prints Name in a Given Format   *");
            System.out.println("                **************************************");

            System.out.printf("\nType the name in the format 'Lastname, Firstname'");
            String initialFormat = input.nextLine();

            commaPosition = initialFormat.indexOf(',');

            System.out.printf("%nYou have inserted '%s'", initialFormat);
            System.out.printf("%nIndex of comma is %d", commaPosition);

            String last =  initialFormat.substring(0, commaPosition);
            last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

            String first =  initialFormat.substring(commaPosition + 2);

            System.out.printf("%nFirst name is %s", first);
            System.out.printf("%nLast name is %s", last);
            System.out.printf("%nThe final format is %s %s", first, last);
      }
}

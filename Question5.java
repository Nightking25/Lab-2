import java.util.*;

public class Question5{

      public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.printf("\nType the name in the format 'Lastname, Firstname'");

            String firstFormat = input.nextLine();

            int indexComma = firstFormat.indexOf(',');

            System.out.printf("%nYou have inserted '%s'", firstFormat);
            System.out.printf("%nIndex of comma is %d", indexComma);

            String last =  firstFormat.substring(0, indexComma);
            last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

            String first =  firstFormat.substring(indexComma + 2);

            System.out.printf("%nFirst name is %s", first);
            System.out.printf("%nLast name is %s", last);

            System.out.printf("%nThe final format is %s %s", first, last);
      }
}

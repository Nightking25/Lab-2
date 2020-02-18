import java.util.Scanner;
/*
This program converts inputed Canadian into US dollar and Euro
*/
public class CurrencyConversion {

      public static void main(String[] args) {
          double cad, usd, eur;
          final double usdRate = 0.75;
          final double eurRate = 0.68;
          Scanner sc = new Scanner(System.in);

          System.out.println("How much Canadian Dollars do you have?");
          cad = sc.nextDouble();
          usd = cad * usdRate;
          eur = cad * eurRate;

          System.out.println("\n" + " We have " + cad + " Canadian Dollars");
          System.out.println( cad + " Canadian Dollars is equal to " + usd + " American Dollars");
          System.out.println( cad + " Canadian Dollars is equal to " + eur + " Euros");
      }
}

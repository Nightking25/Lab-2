import java.util.*;

public class ConvertUnits {

  public static void main(String[] args) {
      double distanceInMeters, distanceInFeet;
      final double FACTOR = 3.28084;
      Scanner sc = new Scanner(System.in);

      System.out.println("\nWhat is the distance in Meters?");
      distanceInMeters = sc.nextDouble();
      distanceInFeet = FACTOR * distanceInMeters;

      System.out.println("\n" + distanceInMeters + " meters is equal to "
                          + distanceInFeet + " feet.");
  }
}

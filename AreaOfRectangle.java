import java.util.Scanner;

// This program askes the user for length and height and calculates the area and perimeter
public class AreaOfRectangle {

      public static void main(String[] args) {
          float length, height;
          Scanner scanner = new Scanner(System.in);

          System.out.println("*****This program prints the area of a Rectangle*****");

          System.out.println("Enter the length.");
          length = scanner.nextInt();

          System.out.println("Enter the height.");
          height = scanner.nextInt();

          float area = length * height;
          float perimeter = 2 * ( length + height);

          System.out.println("The area is: " + area);
          System.out.println("The perimeter is: " + perimeter);

      }
}

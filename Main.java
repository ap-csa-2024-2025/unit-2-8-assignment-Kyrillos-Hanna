import java.util.Scanner;
import java.lang.Math;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a positive int");
    int n = sc.nextInt();
    printRandom3(n);

		System.out.println("Enter x1 value");
		double x1 = sc.nextDouble();
    System.out.println("Enter x2 value");
		double x2 = sc.nextDouble();
    System.out.println("Enter y1 value");
		double y1 = sc.nextDouble();
    System.out.println("Enter y2 value");
		double y2 = sc.nextDouble();
		System.out.println("Slope: " + calcSlope(x1, x2, y1, y2));

    System.out.println("Enter 2 doubles");
    double d1 = sc.nextDouble();
    double d2 = sc.nextDouble();
    System.out.println("Distance: " + roundedDist(d1, d2));


  }

  public static void printRandom3(int n) {
    n+=1;
    System.out.println((int) (Math.random() * n) + 2);
    System.out.println((int) (Math.random() * n) + 2);
    System.out.println((int) (Math.random() * n) + 2);
  }

  public static double calcSlope(double x1, double x2, double y1, double y2) {
    return (y2 - y1) / (x2 - x1);
  }

  public static int roundedDist(double num1, double num2) {
    return (int) (Math.abs((num1 - num2)) + 0.5);
  }
}

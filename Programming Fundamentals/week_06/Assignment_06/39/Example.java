import java.util.*;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first integer: ");
        int num1Int = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2Int = scanner.nextInt();

        System.out.print("Enter first double: ");
        double num1Double = scanner.nextDouble();

        System.out.print("Enter second double: ");
        double num2Double = scanner.nextDouble();

        int resultInt = absoluteDifference(num1Int, num2Int);
        double resultDouble = absoluteDifference(num1Double, num2Double);

        System.out.println("Absolute difference for integers: " + resultInt);
        System.out.println("Absolute difference for doubles: " + resultDouble);

        scanner.close();
    }

    private static int absoluteDifference(int a, int b) {
        return Math.abs(a - b);
    }

    private static double absoluteDifference(double a, double b) {
        return Math.abs(a - b);
    }
}


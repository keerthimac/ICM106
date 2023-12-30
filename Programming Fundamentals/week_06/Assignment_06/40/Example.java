

public class Example{

    public static void main(String[] args) {
        int num1Int = 5;
        int num2Int = 7;
        double num1Double = 3.14;
        double num2Double = 2.5;
        String str1 = "Hello";
        String str2 = "World";

        printSum(num1Int, num2Int);
        printSum(num1Double, num2Double);
        printSum(str1, str2);
    }

    public static void printSum(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    public static void printSum(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    public static void printSum(String a, String b) {
        System.out.println("Concatenated string: " + a + " " + b);
    }
}


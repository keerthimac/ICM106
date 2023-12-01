import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the seconds
        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();


        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;

        // Display the result in the desired format
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

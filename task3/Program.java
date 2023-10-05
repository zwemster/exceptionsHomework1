package task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input some text: ");

        String userInput = scanner.nextLine();

        try {
            if (userInput.isEmpty()) {
                throw new Exception("Error: you can't input empty strings.");
            } else {
                System.out.println("You input: " + userInput);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

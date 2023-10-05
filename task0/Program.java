package task0;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        float userInput = floatNumberInput("Input a float number: ");
        System.out.println("You input: " + userInput);
    }

    public static float floatNumberInput(String prompt) {
        float inputNumber = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(prompt);
            inputNumber = Float.parseFloat(scanner.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid format.");
        }
        return inputNumber;
    }
}

import java.util.*;

public class Calculator {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        System.out.print("Please type in the expression: ");
        boolean win = true;

        while (win) {
            String userInput = sc.nextLine();

            if (theCalculator(userInput) == -1) {
                System.out.println("You miss typed something.Please try again.");
            }
            else {
                System.out.println("The result is: " + theCalculator(userInput));
                win = false;
            }
        }






    }
    public static int theCalculator (String userInput) {
        String[] input = userInput.split(" ");

        int firstNumber = Integer.parseInt(input[1]);
        int secondNumber = Integer.parseInt(input[2]);

        if (input[0].equals("+")){
            return firstNumber + secondNumber;
        }
        else if (input[0].equals("-")){
            return firstNumber - secondNumber;
        }
        else if (input[0].equals("*")){
            return firstNumber * secondNumber;
        }
        else if (input[0].equals("/")){
            return firstNumber / secondNumber;
        }
        else if (input[0].equals("%")){
            return firstNumber % secondNumber;
        }
        else {
            return  -1;
        }
    }


    }

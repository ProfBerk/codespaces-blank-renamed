// File: App.java
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("🌟 Welcome to The Polite Adder!");
        System.out.println("Today's goal: Add two numbers and say thank you like a classy robot.");

        Scanner scanner = new Scanner(System.in); // TODO use in steps below

        // TODO Step 1: Read the user's name using scanner.nextLine()
        //   - If the name is empty (after trimming), use "friend" as fallback

        // TODO Step 2: Read the first number as a string, then parse to double
        //   - Use Double.parseDouble(scanner.nextLine())

        // TODO Step 3: Read the second number the same way

        // TODO Step 4: Compute the sum

        // TODO Step 5: Print a message like:
        //   "Hello, [name]! The sum is [sum]. You’re welcome!"

        // 📝 Sample expected transcript:
        //   🌟 Welcome to The Polite Adder!
        //   Today's goal: Add two numbers and say thank you like a classy robot.
        //   Enter your name: Ada
        //   Enter first number: 3.5
        //   Enter second number: 2.5
        //   Hello, Ada! The sum is 6.0. You’re welcome!

        // ✅ Manual test checklist:
        //   [ ] Runs without errors
        //   [ ] Reads name and two numbers
        //   [ ] Handles empty name → "friend"
        //   [ ] Prints correct sum
        //   [ ] Uses nextLine() + parsing (no nextDouble())

        // What you learn by filling this file (Level 1 / Layer 1 skills):
        // - Basic console I/O with Scanner
        // - Variable declaration and arithmetic
        // - Simple string handling and fallback logic
        // - Program structure: main method, sequential steps
    }
}
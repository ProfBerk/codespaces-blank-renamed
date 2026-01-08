// File: App.java
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("📚 Welcome to Grade Keeper Lite!");
        System.out.println("Keep track of up to 5 students and their exam scores.");

        Gradebook gradebook = new Gradebook();
        Scanner scanner = new Scanner(System.in);

        // TODO Step 1: Print the menu:
        //   "1. Add student"
        //   "2. Show all"
        //   "3. Exit"

        // TODO Step 2: Read the user's choice using scanner.nextLine()
        //   - Parse to integer with Integer.parseInt()
        //   - Wrap in a loop that continues until choice == 3

        // TODO Step 3: Inside the loop, use if-else or switch:
        //   - If choice == 1:
        //        • Prompt for name and score (use nextLine for both)
        //        • Parse score with Double.parseDouble()
        //        • Call gradebook.addStudent(name, score)
        //   - If choice == 2: call gradebook.printAll()
        //   - If choice == 3: break
        //   - Else: print "Invalid choice. Try again."

        // TODO Step 4: After loop ends, print "Goodbye!"

        // 📝 Sample expected transcript:
        //   📚 Welcome to Grade Keeper Lite!
        //   Keep track of up to 5 students and their exam scores.
        //   1. Add student
        //   2. Show all
        //   3. Exit
        //   > 1
        //   Enter name: Maya
        //   Enter score: 88.5
        //   1. Add student
        //   2. Show all
        //   3. Exit
        //   > 2
        //   Maya: 88.5
        //   1. Add student
        //   2. Show all
        //   3. Exit
        //   > 3
        //   Goodbye!

        // ✅ Manual test checklist:
        //   [ ] Program compiles and runs
        //   [ ] Menu repeats until user chooses 3
        //   [ ] Can add at least one student
        //   [ ] Shows all students correctly
        //   [ ] Handles invalid menu input gracefully

        // What you learn by filling this file (Level 2 skills):
        // - Menu-driven CLI with loop
        // - Parsing string input to numbers
        // - Calling helper methods
        // - Basic program control flow (if/switch + while)
    }
}
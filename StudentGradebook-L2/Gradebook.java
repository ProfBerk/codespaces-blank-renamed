// File: Gradebook.java

public class Gradebook {
    private String[] names = new String[5];
    private double[] scores = new double[5];
    private int studentCount = 0;

    public void addStudent(String name, double score) {
        // TODO Step 1: Check if gradebook is full using isFull()
        //   - If full, print "Gradebook full! Cannot add more students."

        // TODO Step 2: If not full:
        //   - Store name in names[studentCount]
        //   - Store score in scores[studentCount]
        //   - Increment studentCount

        // Leave this placeholder so program compiles
        if (isFull()) {
            System.out.println("Gradebook full! Cannot add more students.");
            return;
        }
        // ACTUAL LOGIC IS YOUR TODO — the above is just a safe stub
    }

    public void printAll() {
        // TODO Step 1: If studentCount == 0, print "No students yet."

        // TODO Step 2: Otherwise, loop from 0 to studentCount - 1
        //   - Print each entry as: names[i] + ": " + scores[i]

        // Safe stub
        if (studentCount == 0) {
            System.out.println("No students yet.");
            return;
        }
        // ACTUAL LOOP IS YOUR TODO
    }

    public boolean isFull() {
        // TODO: return true if studentCount == 5, else false
        return studentCount == 5; // correct for now — you can keep this line
    }

    // What you learn by filling this file (Level 2 skills):
    // - Managing parallel arrays
    // - Encapsulating data and behavior
    // - Writing helper methods with clear responsibilities
    // - State tracking with a counter
}
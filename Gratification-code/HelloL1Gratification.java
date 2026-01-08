public class HalloL1Gratification {
    public static void main(String[] args) throws Exception {
        System.out.println("Gratification demo — starting...");

        // Progress bar settings
        int width = 40;
        // Animate from 0 to 100 in steps
        for (int percent = 0; percent <= 100; percent += 5) {
            // compute how many characters are "filled"
            int filled = (percent * width) / 100;

            // build a fixed-width bar using simple string concatenation
            String bar = "";
            for (int i = 0; i < filled; i++) {
                bar = bar + "=";
            }
            if (filled < width) {
                bar = bar + ">";
                for (int i = filled + 1; i < width; i++) {
                    bar = bar + " ";
                }
            }

            // print the bar on the same line using '\r' and flush so it updates immediately
            System.out.printf("\r[%s] %3d%%", bar, percent);
            System.out.flush();

            // pause briefly to make the animation visible
            Thread.sleep(80);
        }

        // finish the progress line and pause a little before confetti
        System.out.println();
        Thread.sleep(250);

        // simple confetti: a small set including emoji and ASCII pieces
        String[] pieces = {"🎉", "✨", "*", "!"};

        // print a few lines of random confetti using Math.random()
        for (int line = 0; line < 6; line++) {
            int lineLen = 30 + (int)(Math.random() * 11); // 30..40 chars
            String out = "";
            for (int i = 0; i < lineLen; i++) {
                int idx = (int)(Math.random() * pieces.length);
                out = out + pieces[idx];
                if (Math.random() < 0.08) {
                    out = out + " ";
                }
            }
            System.out.println(out);
        }

        System.out.println("\nGratification achieved! :)");
    }
}

public class HelloGratification {
    private static final String RESET  = "\u001B[0m";
    private static final String GREEN  = "\u001B[32m";
    private static final String CYAN   = "\u001B[36m";
    private static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) throws Exception {
        System.out.println(CYAN + "Codespace Gratification — starting..." + RESET);

        // animated progress bar
        for (int i = 0; i <= 100; i += 2) {
            String bar = buildBar(i, 40);
            System.out.printf("\r%s[%s]%s %3d%%", GREEN, bar, RESET, i);
            System.out.flush();
            Thread.sleep(60);
        }
        System.out.println(); // newline after progress

        Thread.sleep(300);
        System.out.println(YELLOW + "\nDone! Here's some confetti for you:\n" + RESET);
        System.out.println(generateConfetti(7));
        System.out.println(GREEN + "Gratification achieved! 🎉" + RESET);
    }

    private static String buildBar(int percent, int width) {
        int filled = (int) Math.round(width * percent / 100.0);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (i < filled) b.append('=');
            else if (i == filled) b.append('>');
            else b.append(' ');
        }
        return b.toString();
    }

    private static String generateConfetti(int lines) {
        String[] pieces = {"🎉", "✨", "🔥", "🌟", "💫", "🥳", "🎈", "🍾", "👏"};
        StringBuilder out = new StringBuilder();
        java.util.Random rnd = new java.util.Random();
        for (int i = 0; i < lines; i++) {
            int width = 30 + rnd.nextInt(11); // 30..40
            for (int j = 0; j < width; j++) {
                out.append(pieces[rnd.nextInt(pieces.length)]);
                if (rnd.nextDouble() < 0.08) out.append(' ');
            }
            out.append('\n');
        }
        return out.toString();
    }
}
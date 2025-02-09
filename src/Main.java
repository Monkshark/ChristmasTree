import java.util.Random;  

public class Main {
    public static void main(String[] args) {
        int treeHeight = 10;
        drawChristmasTree(treeHeight);
    }

    static void drawChristmasTree(int height) {
        String GREEN = "\u001B[32m";
        String BROWN = "\u001B[33m";
        String RED = "\u001B[31m";
        String BLUE = "\u001B[34m";
        String YELLOW = "\u001B[33m";
        String RESET = "\u001B[0m";
        Random random = new Random();

        System.out.println(" ".repeat(height - 1) + YELLOW + "⭐" + RESET);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                int color = random.nextInt(4);
                switch (color) {
                    case 0 -> System.out.print(RED + "*" + RESET);
                    case 1 -> System.out.print(BLUE + "*" + RESET);
                    default -> System.out.print(GREEN + "*" + RESET);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(" ".repeat(height + 5) + BROWN + "*" + RESET);
            System.out.println();
        }
    }
}
 
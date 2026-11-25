public class Loops {

    public static void normalLop() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("FOUND");
                break;
            }
        }
    }

    public static void nestedLoop() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println(i + " - " + j);
            }
        }
    }

    public static void transactionProcessor() {
        int attempts = 3;
        for (int i = 1; i <= 5; i++) {

            if (i == attempts) {
                continue;
            }

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }

    private static void squarePattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    private static void triangle() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void invertedTriangle() {
        int rows = 5;
        int columns = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightAngledTriangle() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upsideDownTriangle() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= rows - i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // squarePattern();
        // invertedTriangle();
        // rightAngledTriangle();
        upsideDownTriangle();
    }
}

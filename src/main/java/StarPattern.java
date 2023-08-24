public class StarPattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= 14; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 7; i++) {
            for (int j = 2; j <= 3; j++) {
                System.out.print(" *");
            }
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print("  *");
            }
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print("    *");
            }
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2* 10; j++) {
                if ((10 - i < j) && (j < 10 +1+ i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

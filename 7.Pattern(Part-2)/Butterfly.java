public class Butterfly {
    public static void butterfyl(int n) {
        // outer loop
        // 1st half
        for (int i = 1; i <= n; i++) {
            // inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // for spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // again for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        //
        for (int i = n; n >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // for spaces 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // again for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        butterfyl(5);

    }

}

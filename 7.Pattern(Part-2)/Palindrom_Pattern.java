public class Palindrom_Pattern {
    public static void Number(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {

            // innner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // decending loop

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // assending loop
            for (int j =2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Number(5);

    }

}

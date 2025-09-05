public class factorial {
    public static int Calculate_factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static void main(String[] args) {
        int result = Calculate_factorial(5);
        System.out.println("factorial is :" + result);

    }

}

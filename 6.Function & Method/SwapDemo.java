class SwapDemo {
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5, y = 10;
        SwapDemo obj = new SwapDemo();

        System.out.println("Before swap: x = " + x + ", y = " + y);
        obj.swap(x, y);
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}

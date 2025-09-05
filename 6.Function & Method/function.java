public class function {
    // function without parameter
    public static void PrintHello() {
        System.out.println("Good morning World");
    }

    // function with parameter
   public static int add(int a, int b) {  //parameters
        return a + b;
    }

    public static void main(String[] args) {
        PrintHello(); // calling function
        PrintHello();
        int sum = add(10, 200);  //arguments
        System.out.println("sum is:" + sum);
    }

}

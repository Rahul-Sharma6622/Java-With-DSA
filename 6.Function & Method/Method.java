
public class Method {
    // method without parameter
    void greek() {
        System.out.println("hello Rahul");
    }

    // Method with parameters and return value
    int add(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {
        Method obj = new Method();
        obj.greek();
        int sum = obj.add(8, 9);
        System.out.println(sum);

    }

}

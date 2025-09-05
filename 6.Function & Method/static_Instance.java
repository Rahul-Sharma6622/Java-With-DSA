public class static_Instance {
    // Instance Method
    void instanceMethod() {
        System.out.println("Instance Method: Needs object");
    }

    // Static Method
    static void staticMethod() {
        System.out.println("Static Method: No object needed");
    }

    public static void main(String[] args) {
        // Static method ko bina object ke call kar sakte ho class nmae ke through.

        static_Instance.staticMethod();

        // Instance method ke liye object banana zaruri hai
        static_Instance obj = new static_Instance();
        obj.instanceMethod();

    }

}

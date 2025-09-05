public class Function_Overloading {

    // add two integers
    int add(int a, int b) {
        return a + b;
    }

    // add three integers (different number of parameters)

    int add(int a, int b, int c) {
        return a + b + c;

    }

    // add two doubles (different data types)
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Function_Overloading obj = new Function_Overloading();
        System.out.println(obj.add(20, 50));  // calls int add(int,int)
        System.out.println(obj.add(10, 20, 80));   // calls int add(int,int,int)
        System.out.println(obj.add(59.90, 56.78));    // calls double add(double,double)

    }

}

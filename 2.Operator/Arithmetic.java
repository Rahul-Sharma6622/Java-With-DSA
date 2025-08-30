public class Arithmetic {
    public static void main(String args[]) {

        // Binary Operator : +,-,*,/,%
        // this operator is used between two operands.
        int a = 10;
        int b = 5;
        System.out.println("Additin is : " + (a + b));
        System.out.println("Substaction is " + (a - b));
        System.out.println("Multiplication is : " + (a * b));
        System.out.println("Division is : " + (a / b));
        System.out.println("Modulus is " + (a % b));

        // Unary Operator like : ++ , --,
        // It used for single operand.
        // Pre increment ++A ,
        // 1.value change,
        // 2.value used;

        int A = 50;
        int B = ++A;
        System.out.println(A);
        System.out.println(B);

        // Post increment A++ ,
        // Rules.
        // 1.value used;
        // 2.value change;

        // int A = 50;
        // int B = A++;
        // System.out.println(A);
        // System.out.println(B);

        // similarly pre decrement (--A) ,and post decrement (A--) are used.

    }
}
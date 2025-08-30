public class Logical_Operator {
    public static void main(String[] args) {
        // three types of logical operator
        // 1.logical AND(&&)
        // 2.logical OR(||)
        // 3.logical NOT(!)

        System.out.println((9 > 5) && (40 < 50)); // true
        System.out.println((3 < 2) && (5 > 9)); // false

        // logical OR

        System.out.println((4 > 5) || (6 > 5)); // true
        System.out.println((5 > 8) || (30 < 29)); // false

        // logical NOT

        System.out.println(!(10 > 5)); // false
        System.out.println(!(3 < 2)); // true

    }

}

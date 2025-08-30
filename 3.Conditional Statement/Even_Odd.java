import java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Even or Odd:");

        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is Even Number");
        } else {
            System.out.println(a + " is Odd Number");
        }
    }

}

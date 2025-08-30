
import java.util.*;
public class Average_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int first = sc.nextInt();
        System.out.println("enter second number");
        int second = sc.nextInt();
        System.out.println("enter third number");
        int third = sc.nextInt();
        int average = (first+second+third)/3;
        System.out.println("averege of three number = " +average);
    }
    
}


import java.util.*;
public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Good morning " + name);
        System.out.println("Enter Any number");
        int number = sc.nextInt();
        System.out.println(number);
        System.out.println("Enter Decimal number ");
        float f = sc.nextFloat();
        System.out.println("your decimal value is " +f);
        
        //by using scanner class yoy can take input from the user.
        //this Scanner class present in java.util package.
    }
    
}

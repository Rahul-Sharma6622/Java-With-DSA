
import java.util.*;

public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i = 1;
        // while(i<=5){
        // System.out.println("number " +i);
        // i++;
        // }

        // int count = 0;
        // while (count < 10) {
        // System.out.println("hello world");
        // count++;

        // }

        // print number from 1 to 10
        // int number = 1;
        // while(number<=10){
        // System.out.println(number);
        // number++;
        // }

        // print 1 to n number from user;

        // System.out.println("enter the number ");
        // int digit = sc.nextInt();
        // int n = 1;

        // while (n <= digit) {
        //     System.out.println(n);
        //     n++;

        // }
        // System.out.println();


        //print sum of first n natural number.
        System.out.println("enter the number if you want to print the number");
        int n = sc.nextInt();
        int i = 1;
        int sum=0;

        while (i<=n) {
            sum = sum+i;
            i++;  
        }
        System.out.println("sum is " +sum);
        


    }
}
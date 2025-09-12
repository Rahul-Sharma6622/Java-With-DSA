import java.util.*;

public class Input_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input ke liye
        int marks[] = new int[100];  //length 100
        System.out.println("enter physics marks");
        marks[0] = sc.nextInt();
        System.out.println("enter chemistry marks");
        marks[1] = sc.nextInt();
        System.out.println("enter math marks");
        marks[2] = sc.nextInt();

        System.out.println(" your physics marks = " + marks[0]);
        System.out.println(" your chemistry marks = " + marks[1]);
        System.out.println(" your math marks = " + marks[2]);

        int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
        System.out.println("percentae is : " + percentage + "%");

        //length properties
        System.out.println("length of marks array is " + marks.length);



    }

}

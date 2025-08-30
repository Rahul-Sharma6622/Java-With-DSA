import java.util.Scanner;

public class Area_of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the square:");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of the square = " + area);
    }
    
}

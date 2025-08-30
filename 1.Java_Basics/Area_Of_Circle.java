import java.util.*;

public class Area_Of_Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle is :" + area);

        // type casting

        int a = 10;
        long b = a;
        System.out.println(b);

        long c = 20;
        int d = (int) c;
        System.out.println(d);

        float h = 40.5f;
        int e = (int) d;
        System.out.println(e);

    }
}
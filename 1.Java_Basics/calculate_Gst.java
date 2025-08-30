import java.util.*;


public class calculate_Gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("pen price");
        float pen = sc.nextFloat();
        System.out.println("pencil price");
        float pencil = sc.nextFloat();
        System.out.println("eraser price");
        float eraser = sc.nextFloat();

        float total = pen+pencil+eraser;
        System.out.println("Bill is = " +total);

        //add 18% tax
        float newTotal = (total * 18)/100 + total;
        System.out.println("Total bill after adding GST = " +newTotal);
    }
    
}

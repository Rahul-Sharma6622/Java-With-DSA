public class Hollow_Reactangle {

    public static void hollow_Reactangle(int tolrow, int totcol) {
        // outer loop for row
        for (int i = 1; i <= tolrow; i++) {
            // inner loop for colom
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || i == tolrow || j == 1 || j == totcol) {
                    //boundary cell i,j
                    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
             System.out.println();

        }
       
    }

    public static void main(String[] args) {
        hollow_Reactangle(4, 5);

    }

}

public class if_else_if {
    public static void main(String[] args) {
        int number = 15;

        if (number < 10) {
            System.out.println("The number is less than 10.");
        } else if (number < 20) {
            System.out.println("The number is between 10 and 20.");
        } else if (number < 30) {
            System.out.println("The number is between 20 and 30.");
        } else {
            System.out.println("The number is 30 or greater.");
        }   
    }
    
}

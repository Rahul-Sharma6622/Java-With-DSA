public class Product {
     
    int multiply(int a,int b){
        int result = a*b;
       return result;
    }
    public static void main(String[] args) {
        Product obj = new Product();
        int multiply =  obj.multiply(5, 8);
        System.out.println("product of a and b = " +multiply);
        
    }
    
}

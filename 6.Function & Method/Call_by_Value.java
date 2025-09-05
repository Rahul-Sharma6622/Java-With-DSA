public class Call_by_Value {

    void changeValue(int num){
        num = num+10;
        System.out.println("Inside the method : " +num);
    }
    public static void main(String[] args) {
        int x = 5;
        Call_by_Value obj = new Call_by_Value();
        System.out.println("Before methos call : " + x);
        obj.changeValue(x);
        System.out.println("after method call : " +x);
        
    }
    
}

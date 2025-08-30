import java.util.Scanner;

public class Practice_Question {
    public static void main(String[] args) {
        // question 1 = Write a java program to get a number from the user and print the
        // weither it is positive or negative

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int number = sc.nextInt();
        // if(number>=0){
        // System.out.println("your number is positive");
        // } else{
        // System.out.println("your number is negative");
        // }

        // question 2 = finish the following code so that it prints you have a fever if
        // your temperature is above 100 and otherwise prints you do not have fever.

        // double temperature = 100.34;
        // if (temperature >= 100) {
        // System.out.println("you have a fever");
        // } else {
        // System.out.println("you don't have a fever");
        // }

        // question 3 = Write a java programming to input week (1-7) and print day of
        // the week name using switch case.
        System.out.println("Enter the day (1-7)");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid input please enter the week number between 1 to 7");

        }

    }

}

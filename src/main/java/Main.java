import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int choice;
        float num1, num2;
        while(true) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Square Root \n2. Factorial \n3. Natural Logarithm \n4. Power \n5. Exit");
            choice = in.nextInt();
            switch(choice){
                case 1: System.out.println("Enter a number:");
                        num1 = in.nextFloat();
                        System.out.println("The square root of " + num1 + " is " + squareRoot(num1) + "\n");
                        break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice, please try again\n");
            }
        }
    }
    public static double squareRoot(float num){
        return Math.sqrt(num);
    }
}

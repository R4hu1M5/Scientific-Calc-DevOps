import java.lang.*;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int choice, num;
        double num1, num2;
        while(true) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("1. Square Root \n2. Factorial \n3. Natural Logarithm \n4. Power \n5. Exit");
            choice = in.nextInt();
            switch(choice){
                case 1: System.out.println("Enter a number:");
                        num1 = in.nextDouble();
                        System.out.println("The square root of " + num1 + " is " + squareRoot(num1) + "\n");
                        break;
                case 2: System.out.println("Enter a non-negative integer:");
                        num = in.nextInt();
                        System.out.println("The factorial of " + num + " is " + factorial(num) + "\n");
                        break;
                case 3: System.out.println("Enter a number:");
                        num1 = in.nextDouble();
                        System.out.println("The natural logarithm of " + num1 + " is " + naturalLog(num1) + "\n");
                        break;
                case 4: System.out.println("Enter a two numbers:");
                        num1 = in.nextDouble();
                        num2 = in.nextDouble();
                        System.out.println("The value of " + num1 + " raised to " + num2 + " is " + power(num1, num2) + "\n");
                        break;
                case 5: System.exit(0);
                default: System.out.println("Invalid choice, please try again\n");
            }
        }
    }

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double squareRoot(double num){
        logger.info("Called squareRoot function on: " + num);
        return Math.sqrt(num);
    }

    public static int factorial(int num){
        logger.info("Called factorial function on: " + num);
        int ret = 1, i = num;
        while(i > 0){
            ret *= i;
            i -= 1;
        }
        return ret;
    }

    public static double naturalLog(double num){
        logger.info("Called naturalLog function on: " + num);
        return Math.log(num);
    }

    public static double power(double num1, double num2){
        logger.info("Called naturalLog function on: " + num1 + " and " + num2);
        return Math.pow(num1, num2);
    }
}

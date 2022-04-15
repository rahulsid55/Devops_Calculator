import java.lang.*;
import java.util.*;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

public class Calculator {

    private int solution;
    private char operators;

    public Calculator()
    {
        solution = 0;
        Scanner operators = new Scanner(System.in);
        Scanner operands = new Scanner(System.in);
    }

    public static double squareRoot(double num) {
        //logger.info("Executing square root function for " + num);
        double ans = Math.sqrt(num);
        return ans;
    }

    public static int factorial(int num) {
        int ans = num;
        //logger.info("Executing factorial function for " + num);
        for (int i = num-1; i >= 1; i --)
        {
            ans = ans*i;
        }
        return ans;
    }

    public static double naturalLog(double num) {
        //logger.info("Executing natural logarithm function for " + num);
        double ans = Math.log(num);
        return ans;
    }

    public static double pow(double num, double exponent) {
        //logger.info("Executing power function for " + num);
        double ans = Math.pow(num, exponent);
        return ans;
    }

    public void calc(int ops, int num, double number, double exponent){

        switch(ops)
        {
            case(1):
                System.out.println(squareRoot(number));

                break;
            case(2):
                System.out.println(factorial(num));
                break;
            case(3):
                System.out.println(naturalLog(number));
                break;
            case(4):
                System.out.println(pow(number, exponent));
                break;
        }
    }
    //private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main (String[] args)
    {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        double number = 0, exp = 0;
        while(true)
        {
            System.out.println("What operation?");
            System.out.println(" Enter 1 for Square Root");
            System.out.println(" Enter 2 Factorial");
            System.out.println(" Enter 3 for Natural Logarithm");
            System.out.println(" Enter 4 for Power Computation");
            System.out.println(" Enter 5 to Exit");

            int ops = scanner.nextInt();
            if (ops == 5)
            {
                System.out.println("Quitting");
                break;
            }
            else
            {
                if (ops == 1)
                {
                    System.out.println("Enter the value to compute square root for");
                    number = scanner.nextDouble();
                }
                else if (ops == 2)
                {
                    System.out.println("Enter the value to compute factorial for");
                    num = scanner.nextInt();
                }
                else if (ops == 3)
                {
                    System.out.println("Enter the value to compute logarithm for");
                    number = scanner.nextDouble();
                }
                else if (ops == 4)
                {
                    System.out.println("Enter the value to compute power for");
                    number = scanner.nextDouble();
                    System.out.println("Enter the value of exponent to compute power for");
                    exp = scanner.nextDouble();
                }

            }
            calc.calc(ops, num, number, exp);
        }

    }
}
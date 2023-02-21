import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter operator(+, -, *, /) ");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();
        scan.close();

        double output=0;
        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("Wrong operator input");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
}

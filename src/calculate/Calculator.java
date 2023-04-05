package calculate;

public class Calculator {

    // Instance method for addition
    public void addition(int a, int b) {
        System.out.println("\nAddition of " + a + " and " + b + " is : " + (a + b));
    }

    // Instance method for subtraction
    public void subtraction(int a, int b) {
        System.out.println("\nSubtraction of " + a + " and " + b + " is " + (a - b));
    }

    //Instance method for division
    public void division(int a, int b) {
        System.out.println("\nDivision of " + a + " and " + b + " is " + (a / b));
    }

    //Instance method for multiplication
    public void multiplication(int a, int b) {
        System.out.println("\nMultiplication of " + a + " and " + b + " is " + (a * b));
    }

    public void calculatorResult(int a, int b, char symbol) {

        switch (symbol) {
            // performs addition between numbers
            case '+':
                addition(a, b);
                break;
            // performs subtraction between number
            case '-':
                subtraction(a, b);
                break;
            // performs division between numbers
            case '/':
                division(a, b);
                break;
            // performs multiplication between numbers
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Please enter one of symbol");
        }

    }
}






import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Input:");
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    String input = scanner.next();
    int num1;
    int num2;
    int result = 0;
    String binaryOut = null;

    switch (input) {
      case "add":
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = calculator.add(num1, num2);
        break;
      case "subtract":
        num1 =scanner.nextInt();
        num2 =scanner.nextInt();
        result = calculator.subtract(num1, num2);
        break;
      case "multiply":
        num1 = scanner.nextInt();
        num2 =scanner.nextInt();
        result = calculator.multiply(num1, num2);
        break;
      case "divide":
        num1 = scanner.nextInt();
        num2 =scanner.nextInt();
        result = calculator.divide(num1, num2);
        break;
      case "binary":
        num1 = scanner.nextInt();
        binaryOut = calculator.intToBinaryNumber(num1);
        break;
      case "fibonacci":
        num1 = scanner.nextInt();
        result = calculator.fibonacciNumberFinder(num1);
        break;
      default:
        result = 0;
        break;
    }

    if (binaryOut != null) {
      System.out.println("Result: " + binaryOut);
    }
    else {
      System.out.println("Result: " + result);
    }

  }
}

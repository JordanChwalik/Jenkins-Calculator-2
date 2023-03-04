import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Welcome to the calculator app.");
    boolean loop = true;
    while (loop) {
      Scanner in = new Scanner(System.in);
      String command = in.next();
      if (command.equalsIgnoreCase("add")) {
        System.out.println(calculator.add(in.nextInt(), in.nextInt()));
      } else if (command.equalsIgnoreCase("subtract")) {
        System.out.println(calculator.subtract(in.nextInt(), in.nextInt()));
      } else if (command.equalsIgnoreCase("multiply")) {
        System.out.println(calculator.multiply(in.nextInt(), in.nextInt()));
      } else if (command.equalsIgnoreCase("divide")) {
        System.out.println(calculator.divide(in.nextInt(), in.nextInt()));
      } else if (command.equalsIgnoreCase("fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(in.nextInt()));
      } else if (command.equalsIgnoreCase("binary")) {
        System.out.println(calculator.intToBinaryNumber(in.nextInt()));
      } else if (command.equalsIgnoreCase("exit")){
        loop = false;
      } else {
        System.out.println("Sorry, I don't recognize that command");
      }
    }
  }
}

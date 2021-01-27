import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    private static double add(double f, double s){
        return f+s;
    }
    private void subtract(){
    }
    private void multiply(){
    }
    private void divide(){
    }

    private static double[] prompt(Scanner s)
    {
        System.out.println("Please input your first number");
        double first = s.nextDouble();
        System.out.println("Please input your second number");
        double second = s.nextDouble();

        return new double[]{first, second};
    }

    private static void promptSecond()
    {
        System.out.println("Please input your second number");
    }
    public static void main(String[] args){
        boolean running = true;

        Scanner s = new Scanner(System.in);
        while(running)
        {
            System.out.println("Please enter the operation you would like to perform (add, subtract, multiply, divide) \nType 'quit' to quit");
            String userInput = s.nextLine().toLowerCase();
            switch(userInput)
            {
                case "add":
                    double[] ary = prompt(s);
                    System.out.println("\nThe result of " + ary[0] + " + " + ary[1] + " is " + add(ary[0], ary[1]) + "\n");
                    break;
                case "subtract":
                    break;
                case "multiply":
                    break;
                case "divide":
                    break;
                case "quit":
                    running = false;
                    break;
                default:
                    System.out.println("Please enter a valid operation (add, subtract, multiply, divide)");
                    break;
            }
        }
    }
}

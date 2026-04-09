package Conditionals;

import java.util.Scanner;

public class basicCalculatorSwitchStatement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        char op = scan.next().charAt(0);
        double y = scan.nextDouble();
        switch(op){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default:
                System.out.println("Invalid Operator");


        } scan.close();

    }
}

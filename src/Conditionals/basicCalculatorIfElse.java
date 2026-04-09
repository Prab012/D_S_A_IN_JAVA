package Conditionals;

import java.util.Scanner;

public class basicCalculatorIfElse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        char op = scan.next().charAt(0);
        double y = scan.nextDouble();
        if(op == '+') System.out.println(x+y);
        if(op == '-') System.out.println(x-y);
        if(op == '*') System.out.println(x*y);
        if(op == '/') System.out.println(x/y);
        scan.close();

    }
}

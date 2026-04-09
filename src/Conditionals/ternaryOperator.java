package Conditionals;
import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args){
        // Replacement for if else
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number to check Even or odd");
        int x = scan.nextInt();
        // condition ? if true : if false
        System.out.println((x%2==0) ? "Even" : "Odd");
        scan.close();
    }
}

package Conditionals;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[]args){
        System.out.println("Provide Value To Give Absolute Value:-");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x<0) System.out.println("The Absolute Value of given. No. "+x+" is " + -x);
        else System.out.println("The Absolute Value of given. No. "+x+" is " + x);
    }
}

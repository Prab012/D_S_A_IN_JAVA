package Conditionals;
import java.util.Scanner;
public class rectangleArea {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide The Length Of Rectangle:-");
        double l = scan.nextDouble();
        System.out.println("Provide The Breadth Of Rectangle:-");
        double b = scan.nextDouble();
        double a = l*b;
        double p = 2*(l+b);
        if(a>p){
            System.out.println("The Area of Rectangle is "+a+" and greater than Perimeter "+p);

        } else if (p>a) {
            System.out.println("The Perimeter of Rectangle is "+p+" and greater than Area "+a);
        }else{
            System.out.println("The Area of Rectangle is "+a+" and equal to Perimeter "+p);
        }
    }
}

package Conditionals;
import java.util.Scanner;
public class triangleValidity {

        public static void main(String[] args) {
            System.out.println("This is a program to check validity of Triangle");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The First Side (in Meter):-");
            double a = scan.nextDouble();
            System.out.println("Enter The Second Side (in Meter):-");
            double b = scan.nextDouble();
            System.out.println("Enter The Third Side (in Meter):-");
            double c = scan.nextDouble();
            if(a<=0 || b<=0 || c<=0){
                System.out.println("Each Side of Triangle must be Greater than Zero");
            }
            else if ((a + b)>c && (a+c)>b && (b+c)>a ){
                System.out.println("The Triangle Is Valid.");
            }else {
                System.out.println("The Triangle Is Not Valid.");
            }
            scan.close() ;
        }
    }

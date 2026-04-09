package Conditionals;
import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide your marks to check your grade:-");
        double x = scan.nextDouble();
        if (x>=81.0 && x<=100.00){
            System.out.println("Your Grades are Very Good");
        } else if (x>=61.00 && x<=80.0) {
            System.out.println("Your Grades are Good");
            
        } else if (x>=40 && x<=60) {
            System.out.println("Your Grades are Average");
            
        }else {
            System.out.println("You are Fail ");
        }
        scan.close();
    }

}

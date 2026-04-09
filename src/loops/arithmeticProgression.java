package loops;
import java.util.Scanner;
public class arithmeticProgression {
    // Program to print ap up to n number of terms
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a = scan.nextInt();
        System.out.print("\nEnter the common difference: ");
        int d = scan.nextInt();
        System.out.print("\n Enter how many terms you want to print: ");
        int n = scan.nextInt();
        int an = a + (n-1)*d;
        System.out.println("\nYour desired A.P. is Printed below:-");
        if (d>0){
          for (int i=a;i<=an;i+=d){
            System.out.print(i+" ");
          }
        }
        else if(d<0){
            for(int i=a;i>=an;i+=d){
              System.out.print(i+", ");
            }
        }else{
            System.out.println(" But Common difference cannot be zero");
        }
        scan.close();
    }
}

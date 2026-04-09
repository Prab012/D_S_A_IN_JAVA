package loops;

import java.util.Scanner;

public class apWithoutMaths {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a = scan.nextInt();
        System.out.print("\nEnter the common difference: ");
        int d = scan.nextInt();
        System.out.print("\n Enter how many terms you want to print: ");
        int n = scan.nextInt();

        System.out.println("\nYour desired A.P. is Printed below:-");
        for (int i=1;i<=n;i++){
            System.out.print(a+", ");
            a+=d;
        }
        scan.close();
    }
}

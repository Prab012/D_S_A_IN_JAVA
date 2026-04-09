package loops;
import java.util.Scanner;
public class tableOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to Print its Table:-");
        int n = scan.nextInt();
        System.out.println("Your Table of Number "+n+" is printed below:-");
        for (int i=n;i<=10*n;i+=n){
            System.out.println(i);
        }
        scan.close();
    }

}

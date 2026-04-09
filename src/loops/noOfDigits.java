package loops;

import java.util.Scanner;

public class noOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. to count its digit:-");
        int x = scan.nextInt();
        int digit=0;
        do {
            x/=10;
            digit+=1;
        }while(x!=0);
        System.out.println("The No. of digits is = "+digit);
        scan.close();
    }
}

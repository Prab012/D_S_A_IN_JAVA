package loops;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. to find sum of digits:-");
        int n = scan.nextInt();
        int sum = 0;
        while(n!=0){
            int last_digit =n%10;
            sum= sum+ last_digit;
            n=n/10;

        }
        System.out.println("The sum of digits of the given no. is "+sum);
        scan.close();
    }
}

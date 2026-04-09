package loops;
import java.util.Scanner;
public class GPWithoutMaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first term:-");
        double a = scan.nextDouble();
        System.out.println("Enter common ratio:-");
        double r = scan.nextDouble();
        System.out.println("Enter how many term do you want to print:-");
        int n = scan.nextInt();
        for (int i=1;i<=n;i+=1){
            System.out.print(a+", ");
            a*=r;
        }
        scan.close();
    }
}

package loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Value Of First Term:-");
        double a = scan.nextDouble();
        System.out.println("Enter The Value Of Common Ratio:-");
        double r = scan.nextDouble();
        System.out.println("Enter How Many Terms Do You Want To Print");
        int n = scan.nextInt();
        double an = a*(Math.pow(r,(n-1)));
        if(r>1){
            for (double i=a;i<=an;i*=r){
                System.out.print(i+", ");
            }

        }
    }
}

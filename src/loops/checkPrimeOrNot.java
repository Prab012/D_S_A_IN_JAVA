package loops;
import java.util.Scanner;
public class checkPrimeOrNot {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide No. To check");
        long n = scan.nextLong();
        boolean flag = true;
        if(n<2){
            flag = false;

        }
        else{
            int i = (int) Math.sqrt(n);
            while(i>1){
                if(n%i==0){
                    flag = false;
                    break;

                }
                i--;

            }}
        if(flag) System.out.println("The Given No. Is Prime ");
        else System.out.println("The Given No. composite");
        scan.close();
    }

}

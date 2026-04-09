package loops;
import java.util.Scanner;
public class checkCompositeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. to check composite or not");
        int x = scan.nextInt();
        if (x<2){
            System.out.println("Neither Prime Nor Composite.");
        }
        else{
        for (int i = 2;i*i<=x;i++){
            if (x%i==0){
                System.out.println("The given No. "+x+" is composite.");
                return;
            }

        }
             System.out.println("The Given No. " +x+ " is Prime");
        }

        scan.close();
    }
}

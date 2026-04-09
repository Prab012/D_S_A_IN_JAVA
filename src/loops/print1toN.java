package loops;
import java.util.Scanner;
public class print1toN {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter up to what integer you want to print counting:-");
        int x = scan.nextInt();
        int i = 1;
        for(;i<=x;){
            System.out.print(i+" ");
            i++;
        }
        scan.close();

    }
}

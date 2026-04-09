package loops;
import java.util.Scanner;
public class basicsOfLoops {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the for which that times Hello World Print:-");
        int x = scan.nextInt();
        for (int i=1;i<=x;i++){
            System.out.println("Hello World");
        }
    }
}

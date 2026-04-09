package Conditionals;
import java.util.Scanner;
public class divisibilitycheckby5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. to check divisibility by 5:-");
        int x = sc.nextInt();
        if (x%5==0) System.out.println("The Given No. "+x+" is divisible by 5 ");
        if (x%5!=0) System.out.println("The Given No. "+x+" is not divisible by 5 ");
    }
}

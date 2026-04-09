package Conditionals;
import java.util.Scanner;
public class greatestOfFour {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide First No.");
        int x = scan.nextInt();
        System.out.println("Provide Second No.");
        int y = scan.nextInt();
        System.out.println("Provide Third No.");
        int z = scan.nextInt();
        System.out.println("Provide Fourth No.");
        int p = scan.nextInt();
        int max = x;
        if (y>max) max = y;
        if(z>max) max = z;
        if (p>max) max = p;
        System.out.println(max+" is the greatest No.");
        scan.close();

    }

}

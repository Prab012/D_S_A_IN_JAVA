package Conditionals;
import java.util.Scanner;
public class leastOfThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide first No.");
        int x = scan.nextInt();
        System.out.println("Provide Second No.");
        int y = scan.nextInt();
        System.out.println("Enter Third No.");
        int z = scan.nextInt();
        if(x==y && y==z) {
            System.out.println("All of them have same value");

        }else if (x<=z && x<=y){
            System.out.println(x+" is least between them");

         }else if (y<=x && y<=z) {
          System.out.println(y+" is least between them");

         }else {
            System.out.println(z+" is least between them");

         }


        scan.close();
    }

}

package Conditionals;
import java.util.Scanner;
public class pointLocationOnGraph {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Abscissa:-");
            int x = scan.nextInt();
            System.out.println("Enter Ordinate:-");
            int y = scan.nextInt();
            if(x == 0 && y == 0 ){
                System.out.println("The point is on origin");

            }else if (x ==0 || y==0){
                if(x==0){
                    System.out.println("The Point is on y axis");

                }else{
                    System.out.println("The Point is on x axis");

                }

            }else if (x>0){
                if(y>0){
                    System.out.println("The point is in I Quadrant");
                }else{
                    System.out.println("The point is in IV Quadrant");
                }
            }else{
                if(y>0){
                    System.out.println("The point is in II Quadrant");
                }else{
                    System.out.println("The point is in III Quadrant");
                }

            }scan.close();

        }
    }


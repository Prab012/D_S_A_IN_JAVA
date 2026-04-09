package Conditionals;
import java.util.Scanner;
public class greatestOfThree {


        public static void main(String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter three numbers:-");
            System.out.println("Enter First Number:");
            int x = scan.nextInt();
            System.out.println("Enter Second Number:");
            int y = scan.nextInt();
            System.out.println("Enter Third Number:");
            int z = scan.nextInt();
            if(x==y && y==z){
                System.out.println(" All are same.");

            }  else{

                if(x>=y && x>=z){

                    System.out.println(x+" is the greatest of them all.");

                }else if(y>=x && y>=z){

                    System.out.println(y+" is the greatest of them all.");

                }else {

                    System.out.println(z+" is the greatest of them all.");
                }

            }
            scan.close() ;
        }
    }

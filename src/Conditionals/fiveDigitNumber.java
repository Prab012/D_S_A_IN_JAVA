package Conditionals;

import java.util.Scanner;

public class fiveDigitNumber {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide No. To Check");
        int x = scan.nextInt();
        if(x>9999 && x<100000){
            System.out.println("The Given No. Is a Five digit No.");

        }else{
            System.out.println("Not a Three Five No.");
        }
        scan.close();
    }
 }


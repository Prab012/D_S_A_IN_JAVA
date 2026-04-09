package Conditionals;

import java.util.Scanner;

public class threeDigitNumber {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide No. To Check");
        int x = scan.nextInt();
        if(x>99 && x<1000){
            System.out.println("The Given No. Is a three digit No.");

        }else{
            System.out.println("Not a Three Digit No.");
        }
        scan.close();
    }
}

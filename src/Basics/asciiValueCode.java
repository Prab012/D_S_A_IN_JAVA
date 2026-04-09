package Basics;

import java.util.Scanner;

public class asciiValueCode {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check Unicode/ASCII value:-");
        char ch = sc.next().charAt(0);
        int x = (int) ch ;
        System.out.println("The ASCII Value of Character "+ch+" is " +x);

    }
}

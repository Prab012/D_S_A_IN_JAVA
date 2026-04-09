package Conditionals;

import java.util.Scanner;

public class evenOddCheck {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. To check whether Odd or Even:-");
        int x = sc.nextInt();

        if(x%2==0){
           System.out.println("The Given Number "+x+" is Even ");

        } else{
            System.out.println("The Given Number "+x+" is Odd ");
        }

    }

}

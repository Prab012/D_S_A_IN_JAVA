package Conditionals;

import java.util.Scanner;

public class ageOfThree {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide age of Ram in years:-");
        int x = scan.nextInt();
        System.out.println("Provide age of Shyam in years:-");
        int y = scan.nextInt();
        System.out.println("Provide age of Ghanshyam in years:-");
        int z = scan.nextInt();
        if (x==y && y==z) System.out.println("The age of All is Same");
        else {
            if (x >= y) {
                if (x >= z) System.out.println("The age of Ram is greatest");
                if (x <= z) System.out.println("The age of Ghanshyam is greatest");
            }
            if (y >= x) {
                if (y >= z) System.out.println("The age of Shyam is greatest");
                if (y <= z) System.out.println("The age of Ghanshyam is greatest");

            }
        }
        scan.close();
    }
}


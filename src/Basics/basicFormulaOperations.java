package Basics;

import java.util.Scanner;

public class basicFormulaOperations {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

 //      code area of circle

        System.out.println("Provide the radius of circle to find area:-");
        double r = sc.nextDouble();
        double a =  3.141592*r*r;
        System.out.println("Area of Circle with radius "+ r + " is "+a);

        // code volume of sphere

           System.out.println("Provide the radius of sphere to find the volume:-");
           double rs = sc.nextDouble();
           double v = (4*rs*rs*rs*3.141592)/3;
           System.out.println("\nVolume of Sphere with radius " +rs+ " is "+v);

        // code for Simple Interest

        System.out.println("Give Principal");
        double p = sc.nextDouble();
        System.out.println("Give Rate in Percent");
        double rate = sc.nextDouble();
        System.out.println("Give Time in Years");
        double t = sc.nextDouble();
        double si = p* rate *t/100;
        double amount = si + p ;
        System.out.println("The Simple Interest Calculated is "+si);
        System.out.println("The Final Amount Calculated is "+amount);



    }

}

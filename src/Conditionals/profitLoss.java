package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide Cost Price:-");
        double cp = scan.nextDouble();
        System.out.println("Provide Selling Price-");
        double sp = scan.nextDouble();
        if(sp>cp){
        double p = sp - cp;
        double pp = (p/cp)*100;
        System.out.println("The amount of profit gained "+p+" & The Profit Percent is "+pp+"%");

        } else if (cp>sp) {
            double l = sp - cp;
            double lp = (l/cp)*100;
            System.out.println("The amount of loss occured "+l+" & The Loss Percent is "+lp+"%");

        } else{
            System.out.println("There is Neither Profit Nor Loss");
        }
        scan.close();

    }
}

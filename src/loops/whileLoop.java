package loops;

public class whileLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Printed using while loop:-");
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //for loop used as while
        System.out.println("Printed Using for loop:-");
        int n = 1;
        for (;n<=10;){
            System.out.print(n+", ");
            n++;
        }

    }
}

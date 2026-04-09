package loops;

public class doWhile {
    public static void main(String[]args){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);
        //do while prints the body one time no matter if the condition itself inside while is false
        int x = 11;
        do {
            System.out.println(x);
            x++;
        }while (i<=10);
    }
}

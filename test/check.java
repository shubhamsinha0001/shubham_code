import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        System.out.print("Positive");
        else if(n==0)
        System.out.print("Zero");
        else
        System.out.print("Negative");
    }
}
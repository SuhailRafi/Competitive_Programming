import java.util.Scanner;
public class BearAndBigBrother {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        int c = 0;
        while (b>=a) {
            a = 3*a;
            b = 2*b;
            c++;
        }
        System.out.println (c);
        sc.close ();
    }
} 
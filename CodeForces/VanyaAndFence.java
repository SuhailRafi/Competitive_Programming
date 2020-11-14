import java.util.Scanner;
public class VanyaAndFence {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int c = 0;
        int h = sc.nextInt ();
        for (int i=0;i<n;i++) {
            if (sc.nextInt()>h) c++;
            c++;
        }
        System.out.println (c);
        sc.close ();
    }
} 
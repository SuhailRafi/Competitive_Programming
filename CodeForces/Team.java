import java.util.Scanner;
public class Team {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int t = 0;
        for (int i=0;i<n;i++) {
            int c = 0; 
            if (sc.nextInt ()==1) c++; 
            if (sc.nextInt ()==1) c++;
            if (sc.nextInt ()==1) c++;
            if (c>=2) t++; 
        }
        System.out.println (t);
        sc.close ();
    }
} 
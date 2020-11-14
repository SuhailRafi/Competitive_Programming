import java.util.Scanner;
public class AntonAndDanik {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        String s = sc.next ();
        int a=0, d=0;
        for (int i=0;i<n;i++) {
            if (s.charAt(i)=='A') a++;
            else if (s.charAt(i)=='D') d++;
        }
        System.out.println (a>d? "Anton":d>a? "Danik":"Friendship");
        sc.close ();
    }
} 
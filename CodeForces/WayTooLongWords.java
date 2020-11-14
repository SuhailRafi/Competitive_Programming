
import java.util.Scanner;
public class WayTooLongWords {
        public static void main (String [] args) {
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt(); 
            String s;
            for (int i=0;i<n;i++) {
                s = sc.next();
                int len = s.length();
                System.out.println(len>10? (s.charAt(0)+""+(len-2)+""+s.charAt(len-1)):s);
            }
        sc.close();
        }
}
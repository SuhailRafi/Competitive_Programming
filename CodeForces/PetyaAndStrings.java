import java.util.Scanner;
public class PetyaAndStrings {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String x = sc.next ();
        String y = sc.next ();
        int valx = 0;
        int valy = 0;

        for (int i = 0; i < x.length(); i++) {
            valx = (int) x.charAt(i);
            valy = (int) y.charAt(i);

            if (valx < 97 ) valx+=32;
            if (valy < 97 ) valy+=32;

            if (valx<valy) {
                System.out.println("-1");
                break;
            }
            if (valx>valy) {
                System.out.println("1");
                break;
            }

            if (i+1==x.length()) System.out.println("0");
        }
        sc.close();
    }
}

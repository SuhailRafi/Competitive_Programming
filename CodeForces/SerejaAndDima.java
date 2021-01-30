import java.util.Scanner;
public class SerejaAndDima {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int [] arr = new int [n];
        int srj = 0, dm = 0, st = 0, fn = n-1;

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i<n; i++) {
            if (st == fn) {
                if (i%2==0) srj+= arr[st];
                else dm+= arr[st];
                break;
            }

            if (arr[st]> arr[fn]) {
                if (i%2==0) srj+= arr[st];
                else dm+= arr[st];
                st++;
            }

            else {
                if (i%2!=0) dm+= arr[fn];
                else srj+= arr[fn];
                fn--;
            }

        }
        System.out.println(srj+" "+dm);
    }
}

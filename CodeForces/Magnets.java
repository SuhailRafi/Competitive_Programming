import java.util.Scanner;
public class Magnets {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), lastNum = sc.nextInt();
        int  count = 1, temp;

        for (int i = 1; i <n; i++) {
            temp = sc.nextInt();
            if (lastNum != temp ) {
                count++;
                lastNum = temp;
            }
        }
        System.out.println(count);
    }
}

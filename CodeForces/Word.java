import java.util.Scanner;
public class Word {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next ();
        int upperCount = 0, lowerCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (((int)s.charAt(i)) < 97) upperCount++;
            else lowerCount++;
        }
        System.out.println(upperCount>lowerCount? s.toUpperCase(): s.toLowerCase());
    }
}

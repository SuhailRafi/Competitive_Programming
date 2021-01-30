import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class BoyOrGirl {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        String name = sc.next ();
        Set<Character> ch = new HashSet<>();

        for (int i = 0; i < name.length(); i++) ch.add(name.charAt(i));
        System.out.println(ch.size()%2 == 0? "CHAT WITH HER!": "IGNORE HIM!");
    }
}
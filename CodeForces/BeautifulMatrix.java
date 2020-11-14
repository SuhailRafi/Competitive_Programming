import java.util.Scanner;
public class BeautifulMatrix {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int pos = 0, move=0;
        int [] ar = new int [25];

        for (int i=0; i<25;i++) {
            ar [i] = sc.nextInt ();
            if (ar[i]==1) pos=i; 
        }
        
        if (pos<14) move = (14-pos)/5;
        else if (pos>10) move = (pos-10)/5;    

        if ((pos%5)<2) move += (2-(pos%5));
        else if ((pos%5)>2) move += ((pos%5)-2);    
        
        System.out.println (move);
        sc.close ();
    }
} 
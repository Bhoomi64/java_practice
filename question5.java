import java.util.*;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int rev = sc.nextInt();

        String original = "";
        for (int i = 3; i >= 0; i--) {
            int bit = (x >> i) & 1; 
            original += bit;
        }

        x = x ^ (1 << rev);

        String updated = "";
        for (int i = 3; i >= 0; i--) {
            int bit = (x >> i) & 1; 
            updated += bit;
        }

        System.out.println("Original: " + original);
        System.out.println("Updated:  " + updated);
        sc.close();
    }
}

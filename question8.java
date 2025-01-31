import java.util.*;
public class question8 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println(reversed);

        sc.close();
    }
}

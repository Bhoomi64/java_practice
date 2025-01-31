import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();

        if (x.length() == y.length() && x.length() > 0 && (x + x).contains(y)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}

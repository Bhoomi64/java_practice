import java.util.*;
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double income = sc.nextDouble();
        boolean dues = sc.nextBoolean();
        String result = (age >= 18 && income >= 30000 && !dues) 
                        ? "You are eligible for premium membership." 
                        : "You are not eligible for premium membership.";

        System.out.println(result);

        sc.close();
    }
}

import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cart = sc.nextDouble();
        double discount;
        if(cart>5000){
            discount = cart*0.2;
            double amount = cart-discount;
            System.out.printf("Discount: %.1f",discount);
            System.out.printf("\nFinal amount: %.1f",amount);
        }else if(cart>=3000&&cart<=5000){
            discount = cart*0.1;
            double amount = cart-discount;
            System.out.printf("Discount: %.1f",discount);
            System.out.printf("\nFinal amount: %.1f",amount);
        }else if(cart<3000){
            discount = 0;
            System.out.printf("Discount: 0.0",discount);
            System.out.printf("\nFinal amount: ",cart);
        }
        sc.close();
    }
}

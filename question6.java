import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        String[] words = x.split(" ");
        
        String longest = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longest = word;
                maxLength = word.length();
            }
        }
        System.out.println(longest);
        sc.close();
    }
}

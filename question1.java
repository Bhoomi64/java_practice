import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade: A");
        }else if(marks>=80&&marks<90){
            System.out.println("Grade: B");
        }else if(marks>= 70 && marks < 80){
            System.out.println("Grade: C");
        }else if(marks>=60&&marks<70){
            System.out.println("Grade: D");
        }else if(marks<60&&marks>=0){
            System.out.println("Grade: F");
        }else{
            System.out.println("Please do not enter marks in negative");
        }
        sc.close();
    }
    
}
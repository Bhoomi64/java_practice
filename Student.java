import java.util.*;
public class Student {
    String name;
    int roll;
    float marks;
    public Student(String name,int roll,float marks){
        this.name=name;
        this.roll = roll;
        this.marks = marks;
    }
    public void displya(){
        System.out.println("Updated Details: "+name+", Roll Number: "+roll+", Marks: "+marks);
    }
    public void update(float updatedmarks){
        this.marks = updatedmarks;
    }
    public void updatebypercentage(float percentage){
        this.marks +=(this.marks*percentage/100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details:");
        System.out.println("Name: ");
        String n = sc.nextLine();
        System.out.println("Roll Number: ");
        int r = sc.nextInt();
        System.out.println("Marks: ");
        float m = sc.nextFloat();
        Student s = new Student(n, r, m);
        System.out.println("Update marks: ");
        System.out.println("New Marks: ");
        float u  = sc.nextFloat();
        s.update(u);
        System.out.println("Updated Details: ");
        s.displya();
        System.out.println("Update marks by percentage increase: ");
        System.out.println("Percentage: ");
        float p = sc.nextFloat();
        s.updatebypercentage(p);
        System.out.println("Updated Details: ");
        s.displya();
        sc.close();
    }
}

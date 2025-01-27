
public class question2 {
    public static void main(String[] args) {
        int intv = 25;
        double doublev = 12.34;
        char charv = 'A';
        boolean booleanv = true;
        System.out.println("Before Conversion: ");
        System.out.println(intv);
        System.out.println(doublev);
        System.out.println(charv);
        System.out.println(booleanv);

        double convertDouble = intv; 
        int convertInt = charv; 

        System.out.println("After conversion: ");
        System.out.println("double to int: " + convertDouble);
        System.out.println("int to char: " + convertInt);
    }
}

import java.util.Scanner;

public class FeetConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        float feet = sc.nextFloat();

        float yards = feet / 3;
        float miles = yards / 1760;

        System.out.println(feet + " feet = " + yards + " yards");
        System.out.println(feet + " feet = " + miles + " miles");
    }
}
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        float base = sc.nextFloat();

        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        float areaInInch = 0.5f * base * height;

        
        float areaInCm = areaInInch * 6.4516f;

        System.out.println("Area in square inches: " + areaInInch);
        System.out.println("Area in square centimeters: " + areaInCm);
}}
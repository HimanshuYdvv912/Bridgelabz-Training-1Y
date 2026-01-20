import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (in cm): ");
        float base = sc.nextFloat();

        System.out.print("Enter height (in cm): ");
        float height = sc.nextFloat();

        float areaInCm = 0.5f * base * height;
        float areaInInch = areaInCm / 6.4516f; // convert sq cm to sq inch

        System.out.println("The Area of the triangle in sq in is " + areaInInch +
                           " and sq cm is " + areaInCm);
    }
}
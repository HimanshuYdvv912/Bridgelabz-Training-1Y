import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics marks: ");
        double p = sc.nextDouble();
        System.out.print("Chemistry marks: ");
        double c = sc.nextDouble();
        System.out.print("Maths marks: ");
        double m = sc.nextDouble();

        double avg = (p + c + m) / 3;

        System.out.println("Average Mark = " + avg);

        if(avg >= 90)
            System.out.println("Grade: A (Excellent)");
        else if(avg >= 75)
            System.out.println("Grade: B (Very Good)");
        else if(avg >= 60)
            System.out.println("Grade: C (Good)");
        else if(avg >= 50)
			System.out.println("Grade: D (Pass)");
        else
            System.out.println("Grade: F (Fail)");

        sc.close();
    }
}
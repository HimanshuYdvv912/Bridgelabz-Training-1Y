import java.util.*;
public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formula = n * (n + 1) / 2;

            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            System.out.println("Formula result = " + formula);
            System.out.println("While loop result = " + sum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
✅ (13) Sum of n natural numbers using for
import java.util.*;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formula = n * (n + 1) / 2;

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Formula result = " + formula);
            System.out.println("For loop result = " + sum);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
✅ (14) Factorial using while loop
import java.util.*;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial = " + factorial);
        } else {
            System.out.println("Invalid input");
        }
    }
}
✅ (15) Factorial using for loop
import java.util.*;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial = " + factorial);
        } else {
            System.out.println("Invalid input");
        }
    }
}


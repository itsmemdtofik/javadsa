import java.util.*;

public class AutomorphicNumber {
    public static int Automorphic(int number) {
        int count = 0;
        int oldNumber = number;
        while (oldNumber != 0) {
            number = number * number;
            if (oldNumber % 10 == number % 10) {
                count++;
                number = number / 10;

            }
            oldNumber = oldNumber / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        int count = Automorphic(n);
        if (count > 0) {
            System.out.println("It is a Automorphic number");
        } else {
            System.out.println("It is not a Automorphic number");
        }
        scanner.close();
    }
}

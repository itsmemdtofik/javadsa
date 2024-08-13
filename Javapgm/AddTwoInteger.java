import java.util.*;

public class AddTwoInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = scanner.nextInt();
        int arr[] = new int[num1];
        System.out.println("Enter the number : ");
        for (int i = 0; i < num1; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < num1; i++) {
            if (arr[i] < arr[i + 1]) {
                arr[i] = arr[i + 1];
            }
        }
        System.out.println(arr[0]);
        scanner.close();

    }
}
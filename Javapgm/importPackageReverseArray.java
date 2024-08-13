import java.util.Scanner;
import p1.p2.ReverseArray;

public class importPackageReverseArray {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the size : ");
			int n = scanner.nextInt();
			System.out.print("Enter the array elements : ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			ReverseArray.reverse(arr, n);		
			for(int i = 0; i < n; i++) {
				System.out.println(arr[i]);
			}
		}
	}
}
import java.util.*;
import java.lang.Math;


class ThirdLargestWithoutSorting {

	public static void thirdLargestNumber(int arr[], int n){

		if(n < 2){
			System.out.println("Invalid input");
			return;
		}

		int firstLargest;
		int secondLargest;
		int thirdLargest ;
		firstLargest = secondLargest = thirdLargest = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++){
			firstLargest = Math.max(firstLargest, arr[i]);
		}

		for(int i = 0; i < n; i++){
			if(arr[i] != firstLargest){
				secondLargest = Math.max(secondLargest, arr[i]);
			}
		}


		for(int i = 0; i < n; i++){
			if(arr[i] != secondLargest){
				thirdLargest = Math.max(thirdLargest, arr[i]);
			}
		}

		int temp = arr[0];
		if(secondLargest != Integer.MIN_VALUE){
			temp = secondLargest;
			System.out.print("The second largest number is : " + secondLargest);
		}
		System.out.println();
		for(int i = 0; i < n; i++){
			if(arr[i] < temp){
				thirdLargest = arr[i];
				break;
			}
		}

		System.out.print("The third largest number is : " + thirdLargest);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the size of an array : ");
			int n = scanner.nextInt();
			int arr[] = new int[n];
			System.out.print("Enter the elements of an array : ");
			for(int i = 0; i < arr.length; i++){
				arr[i] = scanner.nextInt();
			}

			thirdLargestNumber(arr, n);
		}
		System.out.println();
	}
	
}
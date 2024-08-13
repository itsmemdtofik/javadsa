import java.util.Scanner;

class GCDOfNnumber {

	public static int gcd(int a, int b){
		if(a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static int ArrayGCD(int arr[], int n){

		int result = arr[0];
		for(int i : arr){
			result = gcd(result, i);
		}

		return result;
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


			int gcdElement = ArrayGCD(arr, n);
			System.out.print("The gcd element among array is : " + gcdElement);
		}
		System.out.println();
	}
	
}
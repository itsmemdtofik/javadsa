package p1.p2;

import java.util.Scanner;

public class ReverseArray {

	public static int[] reverse(int arr[], int n){

		int i = 0;
		int j = n - 1;
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		return arr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}
}
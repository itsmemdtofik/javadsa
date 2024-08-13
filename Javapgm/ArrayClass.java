import java.util.*;
import java.lang.Math;
public class ArrayClass {

    public static void PeakElementWithIndex(int arr[], int n) {
        int peak = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > peak) {
                peak = arr[i];
                index++;

            }
        }
        System.out.println("The peak element is : " + peak + " and index is : " + index);

    }

    public static void reverseArray(int arr[], int n) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.print("The reversed array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] +", ");
        }
        System.out.println();
    }


    public static void frequencyInArray(int arr[], int freqNumber){
        int count= 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == freqNumber){
                count++;
            }
        }

        if(count > 0){
            System.out.print("The frequency of this element is : " + count);
        }
    }

    public static void removeDuplicate(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i){
                    System.out.print(arr[j]);
                }

                if(arr[i] == arr[j]){
                    break;
                }
            }
        }
    }

    public static void removeEven(int arr[], int n){
        int countOdd = 0;
        int countEven = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countEven++;
                continue;
            }
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
                countOdd++;
            }
        }

        if(countOdd > 0){
            System.out.println("The number of odd number : " + countOdd);
        }

        if(countEven > 0){
            System.out.println("The number of even number : " + countEven);
        }
    }

    public static void SecondLargestWithoutSorting(int arr[], int n) {

       int min = Integer.MIN_VALUE;
       int max = Integer.MIN_VALUE;

       for(int i = 0; i < n; i++) {
           max = Math.max(max, arr[i]);
       }

       for(int i = 0; i < n; i++) {
           if(max > arr[i]) {
               min = Math.max(min, arr[i]);
           }
       }

       System.out.println("The second largest number is : " + min);
    }

    public static void addingElmentUsingList(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<Integer>();
        Set<Integer> hashSet = new HashSet<Integer>(); /*Does not allow allow duplicate and it doest sort the element in sorted order.*/
        Set<Integer> treeSet = new TreeSet<Integer>(); /*Does not allow duplicate and it sort the element in sorting order.*/

        System.out.print("Enter the size : ");
        int n = scanner.nextInt();

        System.out.print("Enter the element of an array : ");
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            arrList.add(arr[i]);
        }

        System.out.println("The All elements in array list are : " + arrList);

        for(int i = 0; i < arr.length; i++){
            hashSet.add(arr[i]);
        }
        
        for(int i = 0; i < arrList.size(); i++) {
            if(arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        
        System.out.println("After removing even integer : " + arrList);

        System.out.println("The All elements in hashset are : " + hashSet);

        for(int i = 0; i < arr.length; i++){
            treeSet.add(arr[i]);
        }

        System.out.println("The All elements in treeSet are : " + treeSet);

        scanner.close();
    }


   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String sname = scanner.nextLine();
    System.out.println("Enter the name of the string is : " + sname);
    addingElmentUsingList();
    scanner.close();
}
}

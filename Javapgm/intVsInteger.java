/**
* int : In Java, int is a primitive data type.
**int, being a primitive data type has got less flexibility.
* TODO : We can only store the binary value of an integer in it.


* !Integer : In Java, Integer is a wrapper class.
* ?Since Integer is a wrapper class for int data type,
it gives us more flexibility in storing, converting and manipulating an int data.

*/
import java.util.*;
class intVsInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 34; /*this is valid */
        Integer n1 = 45; /*This is valid also */
        n1 = Integer.parseInt("10"); /*This is valid */
        //n = int.parseInt("10") /*This is not valid */
        scanner.close();
    }
}
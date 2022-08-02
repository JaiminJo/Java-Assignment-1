/*   Name : Joshi Jaimin
     ID   : 21CE048
     Aim  : Given an array of ints, return true if the sequence of numbers 1, 2, 3 
            appears in the array somewhere.
            array123([1, 1, 2, 3, 1]) → true
            array123([1, 1, 2, 4, 1]) → false
            array123([1, 1, 2, 1, 2, 3]) → true
 */

import java.util.Scanner;

public class Prac_4_main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements : ");
        n = sc.nextInt();
        //Object of Prac_4
        Prac_4 object = new Prac_4(n);
        //Input of array elements
        object.input();
        //Checking for the sequence.
        if (object.Check()) {
            System.out.println("The array contains sequence of 1 2 3.");
        } else {
            System.out.println("The array doesn't contain sequence.");
        }
        sc.close();
    }
}

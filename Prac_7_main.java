/*       Name : Joshi Jaimin 
         ID   : 21CE048
         Aim  : Display numbers in a pyramid pattern.
*/

import java.util.Scanner;

public class Prac_7_main {
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of triangle : ");
        num = sc.nextInt();
        Prac_7 object = new Prac_7(num);
        object.printPyramid();// function to print pyramid of n rows.
        sc.close();
    }
}

/*   Name : Joshi Jaimin 
     ID   : 21CE048
     Aim  : Implement Caesar Cipher.
*/

import java.util.Scanner;

public class Prac_10_main {
    public static void main(String[] args) 
    {
        int shift;
        String message;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the massage to implement Caesar Cipher :");
        message = sc.next();
        System.out.println("Enter shift value :");
        shift = sc.nextInt();
        Prac_10 object = new Prac_10(message, shift);
        //Implementing caesar cipher
        System.out.println("Value after implementation : " + object.implement());
        sc.close();
    }
}
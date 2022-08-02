/*  Name : Joshi Jaimin
    ID   : 21CE048
    Aim  : Given two non-negative int values, return true if they have the same last 
           digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, 
           so 17 % 10 is 7.
           lastDigit(7, 17) → truelastDigit(6, 17) → falselastDigit(3, 113) → true  
 */

public class Prac_3 {
    int num1, num2;

    public Prac_3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean lastDigit() {
        num1 = num1 % 10;
        num2 = num2 % 10;
        if (num1 == num2)
            return true;
        else
            return false;
    }

}


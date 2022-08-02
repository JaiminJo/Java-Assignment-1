/*  Name : Joshi Jaimin
    ID   : 21CE048
    Aim  : The problem is to check whether a given Sudoku solution is correct.
*/
import java.util.Scanner;

public class Prac_9_main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter given Sudoku Solution :");
        int arr1[][] = new int[9][9];
        int arr2[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr1[i][j] = sc.nextInt();
                arr2[j][i] = arr1[i][j];
            }
        }
        Prac_9 object = new Prac_9();
        object.Sudoku(arr1, arr2);
        sc.close();
    }
}

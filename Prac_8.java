/*     Name : Joshi Jaimin
       ID   : 21CE048
       Aim  : The problem is to write a program that will grade multiple-choice tests. 
              Assume there are eight students and ten questions, and the answers are stored in a 
              two-dimensional array. Each row records a student’s answers to the questions,
              as shown in the following array.Students’ Answers to the
                        Questions:0 1 2 3 4 5 6 7 8 9
                        Student 0 A B A C C D E E A D
                        Student 1 D B A B C A E E A D
                        Student 2 E D D A C B E E A D
                        Student 3 C B A E D C E E A D
                        Student 4 A B D C C D E E A D
                        Student 5 B B E C C D E E A D
                        Student 6 B B A C C D E E A D
                        Student 7 E B E C C D E E A D
              The key is stored in a one-dimensional array:Key to the
              Questions:0 1 2 3 4 5 6 7 8 9
              Key D B D C C D A E A D
              Your program grades the test and displays the result. It compares each 
              student’s answers with the key,
              counts the number of correct answers, and displays it.
*/

import java.util.Scanner;

public class Prac_8 {
    char[] key = new char[10];
    char[][] studentAns = new char[8][10];
    int[] result = new int[8];

    Scanner sc = new Scanner(System.in);

    //Takes inout of key and the answers of the students.
    public void input() {
        System.out.print("Enter key of answer : ");
        for (int i = 0; i < key.length; i++) {
            key[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the answers of the student : ");
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter answer of student " + (i + 1) + " : ");
            for (int j = 0; j < 10; j++) {
                studentAns[i][j] = sc.next().charAt(0);
            }
        }
    }

    //Checks the answer of students with key.
    public void check() {
        int mark;
        for (int i = 0; i < 8; i++) {
            mark = 0;
            for (int j = 0; j < 10; j++) {
                if (studentAns[i][j] == key[j])
                    mark++;
            }
            result[i] = mark;
        }
    }

    //Print the result of students.
    public void printResult() {
        System.out.println("**Result**");
        for (int i = 0; i < 8; i++) {
            System.out.println("student " + (i + 1) + " :" + result[i]);
        }
    }
}
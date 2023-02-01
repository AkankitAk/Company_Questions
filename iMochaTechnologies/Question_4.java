package iMochaTechnologies;

import java.util.Scanner;

/* 
    Print the sums of diagonals of a matrix

    Questions link: https://www.geeksforgeeks.org/efficiently-compute-sums-of-diagonals-of-a-matrix/

    Input : 
    4
    1 2 3 4
    4 3 2 1
    7 8 9 6
    6 5 4 3
    Output :
    Principal Diagonal: 16
    Secondary Diagonal: 20

    Input :
    3
    1 1 1
    1 1 1
    1 1 1
    Output :
    Principal Diagonal: 3
    Secondary Diagonal: 3
*/

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int firdig = 0;
        int secdig = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    firdig += arr[i][j];
                if (i + j == n - 1) {
                    secdig += arr[i][j];
                }
            }
        }
        System.out.println("First Diagonal :" + firdig);
        System.out.println("Second Diagonal :" + secdig);
    }

}

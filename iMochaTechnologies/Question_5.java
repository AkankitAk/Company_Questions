package iMochaTechnologies;
/* 
    Count Pairs from two arrays with an even sum

    Question link : https://www.geeksforgeeks.org/count-pairs-from-two-arrays-with-even-sum/

    Input: A[] = {9, 14, 6, 2, 11}, B[] = {8, 4, 7, 20} 
    Output: 4 
    {9, 7}, {14, 8}, {6, 4} and {2, 20} are the valid pairs.

    Input: A[] = {2, 4, 6}, B[] = {8, 10, 12} 
    Output: 3 
*/

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Array size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter the second Array size: ");

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.print("Enter the first Array " + n + " element : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the second Array " + m + " element : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int min = Math.min(n, m);
        System.out.println("Valid pair are :" + min);
    }
}

package Jalan_Technologies;

import java.util.Scanner;

/*

Question 1:
*Write a program that takes as input an array of positive and negative numbers (0 excluded). The objective is to
return those items from the array whose sum is 0. If no such items exist return “No Elements found”
*Example: For an input array [-4, 1, 3, -2, -1],
*one of the possible results would be 3, -2, -1 since their sum is 0.
*Note: If there are more than 1 combination of such items, you can return any 1 of them.

 */

class Question_1 {
    static void sum(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == 0) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sum(arr);
    }
}
package MountBlue_Technologies;
/* 
    Question:- Given a string, the task is to toggle all the characters of the
    string i.e to convert Upper case to Lower case and vice versa.
    Eg:- Input: AbCD
    Output: aBcd

    https://www.geeksforgeeks.org/program-toggle-characters-string/
*/

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
                finalString += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
                finalString += ch;
            } else
                finalString += ch;
        }
        System.out.println(finalString);
    }

}

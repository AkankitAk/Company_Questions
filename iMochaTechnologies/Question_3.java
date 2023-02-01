package iMochaTechnologies;
/* 
    Given a String in the form of a word print the first character of each word 

    Question Link: https://www.geeksforgeeks.org/string-containing-first-letter-every-word-given-string-spaces/

    String str is given which contains lowercase English letters and spaces. It may contain multiple spaces. Get the first letter of every word and return the result as a string. The result should not contain any space.

    Examples: 

    Input : str = "geeks for geeks"
    Output : gfg

    Input : str = "happy   coding"
    Output : hc

*/

public class Question_3 {
    public static void main(String[] args) {
        String S = "happy   coding";
        String s = "";
        String[] arr = S.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            s += str.charAt(0) + "";
        }
        System.out.println(s);
    }
}

package MountBlue_Technologies;

/*
    String str="abc ABC Abc ABc ABC";
    output :6 12 6 6 12

    abc=1+2+3;
    ABC=(1+2+3)*2;

*   a=1,b=2,c=3...............z=26 value lena hai

    Agar koi v String mai small letter alphabet aayega to usme 2 se multiplicity nahi krna hai .
 */

public class Question_1 {
    static String checkStringCapOrSmall(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                return s.toLowerCase();
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "abc ABC Abc aBc ABC";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String orgStr = checkStringCapOrSmall(arr[i]);
            int sm = 0;
            int big = 0;
            for (int j = 0; j < orgStr.length(); j++) {
                char ch = orgStr.charAt(j);
                if (ch >= 'a' && ch <= 'z') {
                    int val = ch - 96;
                    sm += val;
                } else if (ch >= 'A' && ch <= 'Z') {
                    int val = ch - 64;
                    big += val;
                }
            }
            if (sm > 0)
                System.out.print(sm + " ");
            else
                System.out.print(big * 2 + " ");
        }
    }
}

import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Solution {
    boolean MyRegex(String st) {
        int pnt = 0;
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < st.length(); i++) {
            int at = (int) st.charAt(i);
            if ((at > 47 && at < 58) || at == 46) {
                if (at == 46) {
                    pnt++;
                    switch (pnt) {
                        case 1:
                            a = i;
                            break;
                        case 2:
                            b = i;
                            break;
                        case 3:
                            c = i;
                            break;
                        default:
                            // System.out.println("Exit=1");
                            return false;
                    }
                }
                // System.out.println("True"+st.length());
            } else {
                // System.out.println("Exit=2");
                return false;
            }
        }
        int A = st.substring(0, a).length();
        int B = st.substring(a+1, b).length();
        int C = st.substring(b+1, c).length();
        int D = st.substring(c+1).length();
        if (pnt == 3) {
            if ((A == 0 || A>3) || (B == 0 || B>3) || (C == 0) || C>3 || D == 0 || D>3)
                return false;
            if ((Integer.parseInt(st.substring(0, a)) > 255) || (Integer.parseInt(st.substring(a + 1, b)) > 255)
                    || (Integer.parseInt(st.substring(b + 1, c)) > 255)
                    || (Integer.parseInt(st.substring(c + 1)) > 255))

                return false;
        } else {
            // System.out.println("Exit=1");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();
        while (sc.hasNext()) {
            String st = sc.next();
            System.out.println(ob.MyRegex(st));
        }
    }
}

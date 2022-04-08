package easy.greedy;

import java.util.Arrays;

public class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex = 0;
        int cookieIndex = 0;

        while(childIndex < g.length && cookieIndex < s.length) {
            if(g[childIndex] <= s[cookieIndex]) {
                childIndex++;
            }
            cookieIndex++;
        }     

        return childIndex + 1;
    }
}

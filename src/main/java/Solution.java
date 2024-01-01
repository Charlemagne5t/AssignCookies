import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(s);
        Arrays.sort(g);

        for(int i = g.length - 1, j = s.length - 1; i >= 0 && j >=0; i--){
            if(s[j]>= g[i]){
                count++;
                j--;
            }
        }

        return count;
    }
}

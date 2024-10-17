import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (n < 2) return result;
        
        boolean[] flag = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            flag[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (flag[i]) {
                for (int j = i * i; j <= n; j += i) {
                    flag[j] = false;
                }
            }
        }
        
        for (int x = 2; x <= n / 2; x++) {
            int y = n - x;
            if (flag[x] && flag[y]) {
                result.add(List.of(x, y));
            }
        }
        
        return result;
    }
}

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] ast) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < ast.length; i++) {
            int val = ast[i];
            while (!arr.isEmpty() && val < 0 && arr.get(arr.size() - 1) > 0) {
                int top = arr.remove(arr.size() - 1);
                if (top == -val) {
                    val = 0;
                } else if (top > -val) {
                    val = top;
                }
            }
            if (val != 0) {
                arr.add(val);
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}

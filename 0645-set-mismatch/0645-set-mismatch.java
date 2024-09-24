import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] sol = new int[2];
        ArrayList<Integer> num = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            num.add(nums[i]);
        }
        
        Collections.sort(num);
        
        for (int i = 1; i < num.size(); i++) {
            if (num.get(i).equals(num.get(i - 1))) {
                sol[0] = num.get(i);
                break;
            }
        }
        
        for (int i = 1; i <= num.size(); i++) {
            if (!num.contains(i)) {
                sol[1] = i;
                break;
            }
        }
        
        return sol;
    }
}

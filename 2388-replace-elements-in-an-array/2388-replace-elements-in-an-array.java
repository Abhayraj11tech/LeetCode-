import java.util.HashMap;

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
      
        HashMap<Integer, Integer> positionMap = new HashMap<>();
       
        for (int i = 0; i < nums.length; i++) {
            positionMap.put(nums[i], i);
        }
        
      
        for (int i = 0; i < operations.length; i++) {
            int oldVal = operations[i][0];
            int newVal = operations[i][1];
            
          
            int pos = positionMap.get(oldVal);
            
            nums[pos] = newVal;
            positionMap.remove(oldVal);
            positionMap.put(newVal, pos);
        }
        
        return nums;
    }
}

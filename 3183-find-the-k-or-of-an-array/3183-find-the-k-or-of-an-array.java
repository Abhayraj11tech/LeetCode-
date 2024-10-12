class Solution {
    public int findKOr(int[] nums, int k) {


        int[] bitCount = new int[32]; 
        for (int num : nums) {
            for (int j = 0; j < 32; j++) {
                if ((num & (1 << j)) != 0) {
                    bitCount[j]++;
                }
            }
        }

        int result = 0;
      
        for (int j = 0; j < 32; j++) {
            if (bitCount[j] >= k) {
                result |= (1 << j);
            }
        }

        return result;
    }
}

import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);
        
        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int count = countSuccessfulPairs(spell, potions, success);
            result[i] = count;
        }
        
        return result;
    }
    
    private int countSuccessfulPairs(int spell, int[] potions, long success) {
        int left = 0;
        int right = potions.length - 1;
        
   
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) spell * potions[mid] >= success) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
      
        return potions.length - left;
    }
}

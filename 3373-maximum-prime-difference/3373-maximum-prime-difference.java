class Solution {
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i=0;i<nums.length;i++) {
            if (isPrime(nums[i])) {
                arr.add(i);
            }
        }
        
        
        Collections.sort(arr);
        int sol = arr.get(arr.size() - 1) - arr.get(0);
        return sol;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}

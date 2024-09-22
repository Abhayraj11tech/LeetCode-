class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] copy = nums.clone();
        Arrays.sort(copy);

        int mid = (n + 1) / 2;
        int left = mid - 1;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            if(i%2==0){ 
                nums[i] = copy[left--];
            }
            else{
                nums[i] = copy[right--];
            }
        }
    }
}

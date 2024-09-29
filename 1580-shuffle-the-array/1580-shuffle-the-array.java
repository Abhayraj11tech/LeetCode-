class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] sol = new int[2*n];
        int count = 0;
        int p =0;
        int q = 0;
        for(int i=0;i<2*n;i++){
            if(count==0){
                sol[i] = nums[q];
                ++q;
                count = 1;
            }
            else{
                sol[i] = nums[n+p];
                ++p;
                count = 0;

            }
            
        }
        return sol;
    }
}
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               int val1 = nums[i];
               int val2 = nums[j];
               int rem = 0;
               while(val1!=0){
                rem = val1%10;
                val1 = val1/10; 
               }
               int check1 = rem;
               int check2 = val2%10;
               int gcd = 0;
               for(int k=1;k<=check1 && k<=check2;k++){
                if(check1 %k ==0 && check2%k==0){
                    gcd = k;
                }
               }
               if(gcd==1){
                ++count;
               }
            }
        }
        return count;
    }
}
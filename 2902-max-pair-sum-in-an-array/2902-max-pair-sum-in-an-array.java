class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
            int max = Integer.MIN_VALUE;
        int sol = -1;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            String str = Integer.toString(nums[i]);
            char tempArray[] = str.toCharArray();
            Arrays.sort(tempArray);
            String cmp = new String(tempArray);
            char c = cmp.charAt(cmp.length()-1);
            int n = Integer.parseInt(""+c);
            
            for(int j=i+1;j<nums.length;j++){
            String str2 = Integer.toString(nums[j]);
            char tempArray2[] = str2.toCharArray();
            Arrays.sort(tempArray2);
            String cmp2 = new String(tempArray2);
            char c2 = cmp2.charAt(cmp2.length()-1);
            int n2 = Integer.parseInt(""+c2);
            
            if(n2 == n){
                sum += (nums[i] + nums[j]);
                break;
            }
            }
          
            if(sum>max && sum>0){
                sol = sum;
                max = sum;
            }
              
          
        }
  
        return  sol;
       
    }
}
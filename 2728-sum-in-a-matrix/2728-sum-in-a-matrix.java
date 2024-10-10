class Solution {
    public int matrixSum(int[][] nums) {
            int sum = 0;
       
        for(int a=0;a<nums[0].length;a++){ 
            ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
             int num = -1;
            int max = Integer.MIN_VALUE;
            int s1 = 0;
            int s2 = 0;
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]>max){
                    num = nums[i][j];
                    max = nums[i][j];
                    s1 = i;
                    s2 = j;
                }
            }
      
            nums[s1][s2] = Integer.MIN_VALUE;
            arr.add(num);
            }
        Collections.sort(arr);
        sum += arr.get(arr.size()-1);
     
        }

        return sum;
    }
}
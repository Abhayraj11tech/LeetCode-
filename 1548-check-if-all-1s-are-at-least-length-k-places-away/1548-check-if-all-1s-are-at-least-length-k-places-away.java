class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> val = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
               arr.add(i);
               count = 0;
           }
           else{
               ++count;
           }

            }
        for(int i=0;i<arr.size();i++){
            if(i+1<arr.size()){
               int diff =  arr.get(i+1) - arr.get(i);
               val.add(diff-1);
            }
        }
        boolean flag = false;
        Collections.sort(val);
       if(val.size()==0 || val.get(0)>=k ){
            flag = true;
            
        }
       
            return flag;
        
    }
}
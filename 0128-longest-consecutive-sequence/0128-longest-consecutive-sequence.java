class Solution {
    public int longestConsecutive(int[] nums) {
     Arrays.sort(nums);
     int sol = 0;

     if(nums.length>0){ 
       int n = nums.length;
        int count =1;
        int end  = 0;
        ArrayList<Integer> store = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
              if(  (i+1)<n  && nums[i]==nums[i+1] ){
                continue;
            }
            if( ((i+1)<n) && (nums[i+1]-nums[i]==1) ){
                    count++;
            }
            else{
                end = 1;

            }
            if(end ==1){
                    store.add(count);
                    end = 0;
                    count = 1;
            }
        }
        Collections.sort(store);
         sol = store.get(store.size() - 1);
     }

        
        return sol;
 
    }
}
 
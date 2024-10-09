class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            ArrayList<Integer> elm = new ArrayList<>();
            while(val!=0){
                int rem = val%10;
                elm.add(rem);
                val = val/10;
            }
            Collections.reverse(elm);
            for(int j=0;j<elm.size();j++){
                arr.add(elm.get(j));
            }
        }
        int [] sol = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            sol[i] = arr.get(i);
        }
        return sol;
    }
}
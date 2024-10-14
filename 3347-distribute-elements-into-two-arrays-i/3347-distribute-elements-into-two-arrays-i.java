class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(nums[0]);
        b.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(a.get(a.size()-1)>b.get(b.size()-1)){
                a.add(nums[i]);
            }
            else{
                b.add(nums[i]);
            }
        }
        int [] sol = new int [nums.length];
        int p = 0;
        int q = 0;
        for(int j=0;j<nums.length;j++){
            if(j<a.size()){
                sol[j] = a.get(p++);
            }
            else{
                sol[j] = b.get(q++);
            }
        }
        return sol;
    }
}
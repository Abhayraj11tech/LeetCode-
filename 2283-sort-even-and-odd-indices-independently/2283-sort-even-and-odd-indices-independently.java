class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int [] copy = Arrays.copyOf(nums,nums.length);
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(odd);
        Collections.reverse(odd);
        Collections.sort(even);
        int p=0,q=0;
        int [] sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sol[i] = even.get(p++);
            }
            else{
                sol[i] = odd.get(q++);
            }
        }
        return sol;
    }
}
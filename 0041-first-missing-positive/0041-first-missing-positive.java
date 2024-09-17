class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int p = 1;
        int sol = Integer.MIN_VALUE;
        boolean flag = false;
       List<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                arr.add(num);
            }
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=0){
                continue;
            }
            else{
                if(arr.get(i)!=p){
                    sol = p;
                    flag = true;
                    break;
                }
                ++p;
            }
        }
        if(flag == false && arr.get(arr.size()- 1)<=0){
            sol = 1;
        }
        else if(flag==false){
            sol = arr.get(arr.size()- 1) + 1;
        }
        return sol;
    }
}
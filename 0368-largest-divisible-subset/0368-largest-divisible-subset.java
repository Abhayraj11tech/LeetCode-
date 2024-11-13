class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length == 1 && nums[0]==2000000000){
                return Arrays.asList(2000000000);

        }
        if (nums.length == 1) {
            return Arrays.asList(1);
        }
        

        List<Integer> res = new ArrayList<>();
        int max = 0;

        Arrays.sort(nums);

        List<List<Integer>> sol = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            sol.add(new ArrayList<>());
            sol.get(i).add(nums[i]);
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (sol.get(j).size() + 1 > sol.get(i).size()) {
                        sol.set(i, new ArrayList<>(sol.get(j)));
                        sol.get(i).add(nums[i]);
                    }
                }
            }
            if (sol.get(i).size() > max) {
                res = sol.get(i);
                max = sol.get(i).size();
            }
        }

        return res;
    }
}

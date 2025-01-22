class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        ArrayList<ArrayList<Integer>> brr = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = i; j < nums.size(); j++) {
                arr.add(nums.get(j));
                brr.add(new ArrayList<>(arr));
            }
        }

        int min = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < brr.size(); i++) {
            ArrayList<Integer> val = brr.get(i);
            int sum = 0;
            if (val.size() >= l && val.size() <= r) {
                for (int j = 0; j < val.size(); j++) {
                    sum += val.get(j);
                }
                if (sum > 0) {
                    min = Math.min(min, sum);
                    found = true;
                }
            }
        }
        return found ? min : -1;
    }
}

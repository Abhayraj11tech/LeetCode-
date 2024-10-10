
class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        Set<Integer> arr= new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
           arr.add(nums[i]);
        }
        
        for (int i = 0; i < moveFrom.length; i++) {
            if (arr.contains(moveFrom[i])) {
                arr.remove(moveFrom[i]);
                arr.add(moveTo[i]);
            }
        }

        List<Integer> res = new ArrayList<>(arr);
        Collections.sort(res);
        return res;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> Set = new HashSet<>();
 
        for (int element : nums) {
            Set.add(element);
        }
        if(Set.size()==nums.length){
            return false;
        }
        else{
            return true;
        }
    }
}
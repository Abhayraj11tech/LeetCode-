class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> cur = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> val = new HashSet<>();
            val.add(arr[i]); 
            for (Integer x : cur) {
                val.add(x | arr[i]); 
            }
            set.addAll(val);
            cur = val; 
        }

        return set.size();
    }
}

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int cnt = 0;
        Set<String> set = new HashSet<>();
        for(int num : arr1){
            String w = String.valueOf(num);
            for(int i = 1; i <= w.length(); i++){
                set.add(w.substring(0, i));
            }
        }
        for(int num : arr2){
            String w = String.valueOf(num);
            for(int i = 1; i <= w.length(); i++){
                if(set.contains(w.substring(0, i))) cnt = Math.max(cnt, i);
            }
        }
        return cnt;
    }
}
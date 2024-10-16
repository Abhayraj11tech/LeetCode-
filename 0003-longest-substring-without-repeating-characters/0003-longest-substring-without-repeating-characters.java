class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            if (arr.contains(s.charAt(i))) {
                while (arr.contains(s.charAt(i))) {
                    arr.remove(0); 
                }
            }
            arr.add(s.charAt(i));
            if (arr.size() > max) {
                max = arr.size();
            }
        }
        if(arr.size() > max) {
            max = arr.size();
        }
        return max;
    }
}

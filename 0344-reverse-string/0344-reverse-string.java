class Solution {
    public void reverseString(char[] s) {
        char[] arr = Arrays.copyOf(s, s.length);
        for(int i=0;i<arr.length;i++){
            s[i] = arr[arr.length-1-i];
        }

        
    }
}
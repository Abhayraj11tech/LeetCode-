class Solution {
    public int countSubstrings(String s) {
        
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
               String str = "";
            for(int j = i; j < s.length(); j++) {
                str += s.charAt(j);  
                substrings.add(str);
            }
        }

        int count = 0;
        for (String str : substrings) {
            if (isPalindrome(str)) {
                count++;
            }
        }

        return count;
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
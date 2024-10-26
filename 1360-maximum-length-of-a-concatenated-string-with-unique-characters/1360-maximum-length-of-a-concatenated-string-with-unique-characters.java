class Solution {
    public int maxLength(List<String> arr) {
        return backtrack(arr, "", 0);
    }

    private int backtrack(List<String> arr, String current, int index) {
        if (!freq(current)) return 0;
        
        int max = current.length();
        for (int i = index; i < arr.size(); i++) {
            max = Math.max(max, backtrack(arr, current + arr.get(i), i + 1));
        }
        return max;
    }

    private boolean freq(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) return false;
            seen.add(c);
        }
        return true;
    }
}

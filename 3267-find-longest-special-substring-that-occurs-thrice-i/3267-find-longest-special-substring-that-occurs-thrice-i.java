class Solution {
    public int maximumLength(String s) {
        ArrayList<String> arr = new ArrayList<>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str = "";
            for (int j = i; j < s.length(); j++) {
                str += s.charAt(j);

                if (flag(str)) {
                    arr.add(str);
                } else {
                    break; 
                }
            }
        }

        Map<String, Integer> freq = new HashMap<>();
        for (String substring : arr) {
            freq.put(substring, freq.getOrDefault(substring, 0) + 1);
        }

       
        int max = -1;
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() >= 3) {
                max = Math.max(max, entry.getKey().length());
            }
        }

        return max;
    }

    private boolean flag(String str) {
        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                return false;
            }
        }
        return true;
    }
}

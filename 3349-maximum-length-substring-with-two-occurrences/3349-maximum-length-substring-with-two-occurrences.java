class Solution {
    public int maximumLengthSubstring(String s) {
        int max = Integer.MIN_VALUE;
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                str += s.charAt(j);
                arr.add(str);
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            String val = arr.get(i);
            boolean flag = true;
            
            for (int a = 0; a < val.length(); a++) {
                int count = 0;
                for (int b = 0; b < val.length(); b++) {
                    if (val.charAt(b) == val.charAt(a)) {
                        count++;
                    }
                }
                if (count > 2) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                max = Math.max(max, val.length());
            }
        }
        
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}

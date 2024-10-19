class Solution {
    public String reverseStr(String s, int k) {
        String sol = "";
        int count = 0;
        StringBuilder val = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (count == k && flag == true) {
                val.reverse();
                sol += val;
                val.setLength(0);  
                count = 0;
                flag = false;
            } else if (count == k && flag == false) {
                sol += val;
                val.setLength(0);
                count = 0;
                flag = true;
            }
            val.append(s.charAt(i));
            ++count;
        }

        if (val.length() > 0) {
            if (flag) {
                val.reverse();
            }
            sol += val;
        }

        return sol;
    }
}

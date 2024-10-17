import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        ArrayList<String> arr = new ArrayList<>();
        String str = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!str.equals("")) { 
                    arr.add(str);
                    str = "";
                }
            } else {
                str += s.charAt(i);
            }
        }
        if (!str.equals("")) {
            arr.add(str);
        }

        Collections.reverse(arr);

        StringBuilder sol = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sol.append(arr.get(i));
            if (i != arr.size() - 1) {
                sol.append(" ");
            }
        }

        return sol.toString();
    }
}

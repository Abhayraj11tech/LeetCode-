import java.util.ArrayList;

class Solution {
    public String decodeString(String s) {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                num.add(currentNum);
                str.add(currentString.toString());
                currentString = new StringBuilder();
                currentNum = 0;
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(str.remove(str.size() - 1));
                int repeatCount = num.remove(num.size() - 1);
                for (int j = 0; j < repeatCount; j++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(c);
            }

            i++;
        }

        return currentString.toString();
    }
}

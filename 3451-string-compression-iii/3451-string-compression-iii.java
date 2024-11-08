class Solution {
    public String compressedString(String word) {
        StringBuilder sol = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = i; j < word.length(); j++) {
                if (word.charAt(j) != word.charAt(i)) {
                    break;
                }
                count++;
            }

            if (count >= 9) {
                int val = count / 9;
                for (int a = 0; a < val; a++) {
                    sol.append("9").append(word.charAt(i));
                }
                int rem = count % 9;
                if (rem > 0) {
                    sol.append(rem).append(word.charAt(i));
                }
            } else {
                sol.append(count).append(word.charAt(i));
            }

            i += count - 1;
        }

        return sol.toString();
    }
}

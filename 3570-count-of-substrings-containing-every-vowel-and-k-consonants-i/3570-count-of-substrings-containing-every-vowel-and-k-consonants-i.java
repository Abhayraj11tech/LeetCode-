class Solution {
    public int countOfSubstrings(String word, int k) {
        int sol = 0;

        for (int i = 0; i < word.length(); i++) {
            HashMap<Character, Integer> vow = new HashMap<>();
            int conan = 0;

            for (int j = i; j < word.length(); j++) {
                char c = word.charAt(j);

                if ("aeiou".indexOf(c) >= 0) {
                    vow.put(c, vow.getOrDefault(c, 0) + 1);
                } else if (Character.isLetter(c)) {
                    conan++;
                }

                if (vow.size() == 5 && conan == k) {
                    sol++;
                }
            }
        }

        return sol;
    }
}

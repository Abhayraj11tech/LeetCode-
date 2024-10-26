
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> firstOccurrence = new HashMap<>();
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!firstOccurrence.containsKey(ch)) {
                firstOccurrence.put(ch, i);
            } else {
                int length = i - firstOccurrence.get(ch) - 1;
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}

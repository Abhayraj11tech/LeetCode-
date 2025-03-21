class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            set1.add(c);
            freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            set2.add(c);
            freq2.put(c, freq2.getOrDefault(c, 0) + 1);
        }

        if (!set1.equals(set2)) return false;

        List<Integer> freqList1 = new ArrayList<>(freq1.values());
        List<Integer> freqList2 = new ArrayList<>(freq2.values());

        Collections.sort(freqList1);
        Collections.sort(freqList2);

        return freqList1.equals(freqList2);
    }
}

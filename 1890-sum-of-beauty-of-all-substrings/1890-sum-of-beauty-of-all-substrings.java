class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> frequency = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
                
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int freq : frequency.values()) {
                    max = Math.max(max, freq);
                    min = Math.min(min, freq);
                }

                sum += (max - min);
            }
        }
        return sum;
    }
}

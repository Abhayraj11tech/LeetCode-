class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] firstOccurrence = new int[26];
        Arrays.fill(firstOccurrence, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';

            if (firstOccurrence[index] == -1) {
             
                firstOccurrence[index] = i;
            } else {
                
                int calculatedDistance = i - firstOccurrence[index] - 1;
                if (calculatedDistance != distance[index]) {
                    return false;
                }
            }
        }
        return true;
    }
}

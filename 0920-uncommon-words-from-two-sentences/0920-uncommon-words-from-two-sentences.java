class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> l1 = new ArrayList<>();
        String str1 = "";
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                l1.add(str1);
                str1 = "";
            } else if (i == s1.length() - 1) {
                str1 += s1.charAt(i);
                l1.add(str1);
            } else {
                str1 += s1.charAt(i);
            }
        }
        
        ArrayList<String> l2 = new ArrayList<>();
        String str2 = "";
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') {
                l2.add(str2);
                str2 = "";
            } else if (i == s2.length() - 1) {
                str2 += s2.charAt(i);
                l2.add(str2);
            } else {
                str2 += s2.charAt(i);
            }
        }
        
        HashMap<String, Integer> countMap = new HashMap<>();
        
        for (String word : l1) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        for (String word : l2) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        
        ArrayList<String> sol = new ArrayList<>();
        for (String word : countMap.keySet()) {
            if (countMap.get(word) == 1) {
                if (l1.contains(word) && !l2.contains(word) || l2.contains(word) && !l1.contains(word)) {
                    sol.add(word);
                }
            }
        }
        
        return sol.toArray(new String[0]);
    }
}

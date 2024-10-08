
class Solution {
    public int similarPairs(String[] words) {
        ArrayList<String> elm = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder str = new StringBuilder();
            String cmp = words[i];
            for (int j = 0; j < cmp.length(); j++) {
                if (str.indexOf(String.valueOf(cmp.charAt(j))) == -1) {
                    str.append(cmp.charAt(j));
                }
            }
            char tempArray[] = str.toString().toCharArray();
            Arrays.sort(tempArray);
            String s = new String(tempArray);
            elm.add(s);
            
        }

        int count = 0;
        for (int i = 0; i < elm.size(); i++) {
            for (int j = i + 1; j < elm.size(); j++) {
                if (elm.get(i).equals(elm.get(j))) {
                    ++count;
                }
            }
        }
        return count;
    }
}
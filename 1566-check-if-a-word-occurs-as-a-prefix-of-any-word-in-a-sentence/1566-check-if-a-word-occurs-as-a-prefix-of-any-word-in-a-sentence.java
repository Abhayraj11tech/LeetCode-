class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        StringBuilder chk = new StringBuilder();
         ArrayList<String> string = new ArrayList<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                if (chk.length() > 0) {
                    string.add(chk.toString());
                    chk.setLength(0);
                }
            } else {
                chk.append(Character.toLowerCase(sentence.charAt(i)));
            }
        }
          if (chk.length() > 0) {
            string.add(chk.toString());
        }
        int sol = -1;
        for(int i=0;i<string.size();i++){
            String cmp = string.get(i);
            if(cmp.contains(searchWord) && cmp.charAt(0)==searchWord.charAt(0) && cmp.charAt(searchWord.length()-1) == searchWord.charAt(searchWord.length()-1)){
                sol = i+1;
                break;
            }
        }
        return sol;

    }
}
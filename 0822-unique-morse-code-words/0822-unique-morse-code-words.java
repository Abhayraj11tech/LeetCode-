class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String [] cmp = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String sol = "";
        
      ArrayList<String> tmp = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(int j=0;j<s.length();j++){
                int idx = ((int)s.charAt(j)) - 97;
                sol += cmp[idx];
                //   System.out.println(idx);
            }
            // System.out.println(idx);
            // tmp[i] = sol;
            tmp.add(sol);
            sol = "";
        }

        Collections.sort(tmp);
          System.out.println(tmp);
           Set<String> uniq = new HashSet<>(tmp);
         
     
         return uniq.size();
        
}
}
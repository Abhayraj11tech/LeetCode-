class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> sol = new ArrayList<>();
     
        int count = 0;
      int i = 0;
            for(int j=1;j<s.length();j++){
                   if (s.charAt(j) != s.charAt(i)) {
                if (j - i >= 3) {
                         sol.add(List.of(i,j-1));
                         
                        }
                        
                      i = j;
                    }
            }
        if (s.length() - i >= 3) {
            sol.add(List.of(i, s.length() - 1));
        }

        return sol;
    }
}
    

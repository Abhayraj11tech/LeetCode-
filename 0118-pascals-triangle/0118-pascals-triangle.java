class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0){
             return new ArrayList<>();
        }
        if (numRows == 1) {
            List<List<Integer>> sol = new ArrayList<>();
            sol.add(Arrays.asList(1));
            return sol;
        }
        List<List<Integer>> sol = generate(numRows - 1);
        List<Integer> val = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            val.add(1);
        }
        for (int i=1;i<numRows - 1;i++){
            val.set(i,sol.get(numRows - 2).get(i-1) + sol.get(numRows - 2).get(i));
        }
        sol.add(val);
        return sol;
      }
}
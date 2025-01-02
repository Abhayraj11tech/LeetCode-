class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> sol = new ArrayList<>();
            sol.add(Arrays.asList(1));
            return sol;
        }
        
        List<List<Integer>> val1 = generate(numRows - 1);
        List<Integer> val2 = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            val2.add(1);
        }
        
        for (int i = 1; i < numRows - 1; i++) {
            val2.set(i, val1.get(numRows - 2).get(i - 1) + val1.get(numRows - 2).get(i));
        }
        
        val1.add(val2);
        return val1;
    }
}

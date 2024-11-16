class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
         if (tomatoSlices % 2 != 0 || tomatoSlices < 2 * cheeseSlices || tomatoSlices > 4 * cheeseSlices) {
            return Collections.emptyList();
        }
        else{ 
          List<Integer> sol = new ArrayList<>();

        for (int jumbo = 0; jumbo <= cheeseSlices; ++jumbo) {
            int small = cheeseSlices - jumbo;
            
            if (4 * jumbo + 2 * small == tomatoSlices) {
                sol.add(jumbo);
                sol.add(small);
            }
        }

        return sol;
        }
    }
}
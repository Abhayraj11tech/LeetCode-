class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
    
        Integer[] idx = new Integer[heights.length];
        for (int i = 0; i < heights.length; i++) {
            idx[i] = i;
        }


        Arrays.sort(idx, (a, b) -> Integer.compare(heights[b], heights[a]));

        String[] sol = new String[names.length];
        for (int i = 0; i < idx.length; i++) {
            sol[i] = names[idx[i]];
        }

        return sol;
    }
}

  
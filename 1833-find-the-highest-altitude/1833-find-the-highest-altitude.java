class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> sol = new ArrayList<>();
        sol.add(0);
        for(int i=0;i<gain.length;i++){
            sol.add(sol.get(i)+gain[i]);
        }
        Collections.sort(sol);
        return sol.get(sol.size()-1);
    }
}
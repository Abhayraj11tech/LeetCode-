class Solution {
    public String restoreString(String s, int[] indices) {
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            c.add(s.charAt(i));
            arr.add(indices[i]);
        }
        int p =0;
        String sol = "";
        for(int i=0;i<arr.size();i++){
            int idx = arr.indexOf(p++);
            sol += c.get(idx);

        }
        return sol;
        
    }
}
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> sol = new ArrayList<>();
        sol.add(s);
        List<Integer> chk = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && !chk.contains(i)) {
                int size = sol.size();
                for (int j = 0; j < size; j++) {
                    char[] arr = sol.get(j).toCharArray();
                    if (Character.isLowerCase(arr[i])) {
                        arr[i] = Character.toUpperCase(arr[i]);
                    } else {
                        arr[i] = Character.toLowerCase(arr[i]);
                    }
                    sol.add(new String(arr));
                }
                chk.add(i);
            }
        }
        return sol;
    }
}

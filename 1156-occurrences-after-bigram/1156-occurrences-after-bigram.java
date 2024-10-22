class Solution {
    public String[] findOcurrences(String text, String first, String second) {
         String[] arr = text.split(" ");
        List<String> sol = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i].equals(first) && arr[i + 1].equals(second)) {
                sol.add(arr[i + 2]);
            }
        }

        return sol.toArray(new String[0]);
    }
}
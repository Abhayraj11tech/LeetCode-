class Solution {
    public double trimMean(int[] arr) {
               Arrays.sort(arr);

        int remove_f = (int) (0.05 * arr.length);
        int remove_b = (int) (0.05 * arr.length);

        ArrayList<Integer> sol = new ArrayList<>();
        for (int i = remove_f; i < arr.length - remove_b; i++) {
            sol.add(arr[i]);
        }

        double sum = 0;
        for (int k = 0; k < sol.size(); k++) {
            sum += sol.get(k);
        }

        int len = arr.length - (remove_f + remove_b);
        double res = sum / len;
       
        return res;
    }
}
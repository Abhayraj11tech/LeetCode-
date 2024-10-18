class Solution {
    public int numTeams(int[] rating) {
        int count = 0;
        int n = rating.length;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                arr.add((rating[j] > rating[i]) ? 1 : 0);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int nature = (rating[j] > rating[i]) ? 1 : 0;

                for (int k = j + 1; k < n; k++) {
                    if ((nature == 1 && rating[k] > rating[j]) || (nature == 0 && rating[k] < rating[j])) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
        ArrayList<Integer> sol = new ArrayList<>();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0){
                sum += arr1[i--];
            }
            if (j >= 0){
                sum += arr2[j--];
            }

            sol.add(0, sum & 1); 
            carry = -(sum >> 1);
        }

        while (sol.size() > 1 && sol.get(0) == 0) {
            sol.remove(0);
        }

        int[] res = new int[sol.size()];
        for (int k = 0; k < sol.size(); k++) {
            res[k] = sol.get(k);
        }

        return res;
    }
}

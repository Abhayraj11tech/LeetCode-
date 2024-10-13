class Solution {
    public long smallestNumber(long num) {
        if (num == 0){
            return 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        long val = Math.abs(num);

        while (val > 0) {
            arr.add((int) (val % 10));
            val /= 10;
        }

        if (num > 0) {
            Collections.sort(arr);
            if (arr.get(0) == 0) {
                for (int i = 1; i < arr.size(); i++) {
                    if (arr.get(i) != 0) {
                        arr.set(0, arr.get(i));
                        arr.set(i, 0);
                        break;
                    }
                }
            }
        } else {
            Collections.sort(arr, Collections.reverseOrder());
        }

        long sol = 0;
        for (int digit : arr) {
            sol = sol * 10 + digit;
        }

        return num < 0 ? -sol : sol;
    }
}

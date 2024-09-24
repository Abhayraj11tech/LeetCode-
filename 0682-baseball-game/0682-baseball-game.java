class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
       ArrayList<Integer> sol = new ArrayList<>();
        ArrayList<Integer> data = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int last1 = sol.get(sol.size() - 1);
                int last2 = sol.get(sol.size() - 2);
                int newScore = last1 + last2;
                sol.add(newScore);
                data.add(newScore);
            } else if (op.equals("D")) {
                int lastScore = sol.get(sol.size() - 1);
                int newScore = 2 * lastScore;
                sol.add(newScore);
                data.add(newScore);
            } else if (op.equals("C")) {
                if (!data.isEmpty()) {
                    sol.remove(sol.size() - 1);
                    data.remove(data.size() - 1);
                }
            } else {
                int val = Integer.parseInt(op);
                sol.add(val);
                data.add(val);
            }
        }

        int sum = sol.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }}
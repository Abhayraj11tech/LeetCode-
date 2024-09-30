class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        long sum = 0;
        for(int i=1;i<salary.length-1;i++){
            sum += salary[i];
        }
        double sol = (double)sum / (double)(salary.length-2);
        return sol;
    }
}
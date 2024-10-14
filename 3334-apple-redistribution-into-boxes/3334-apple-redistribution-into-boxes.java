class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum  = 0;
        for(int i=0;i<apple.length;i++){
            sum += apple[i];
        }
        int cmp = 0;
        int count = 0;
        for(int j=capacity.length-1;j>=0;j--){
            cmp += capacity[j];
            if(cmp>=sum){
                ++count;
                break;
            }
            else{
                ++count;
            }
        }
        return count;
    }
}
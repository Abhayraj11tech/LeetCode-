class Solution {
    public int findMinDifference(List<String> timePoints) {
        ArrayList<Integer> sol = new ArrayList<Integer>();
        for(int i=0;i<timePoints.size();i++){
            String time = timePoints.get(i);
            String hr = time.substring(0,2);
            String mn = time.substring(3,5);
            
            int h = Integer.parseInt(hr);
            int m = Integer.parseInt(mn);
            if(h==0){
                h = 24;
            }
            int minutes = h*60 + m;
            sol.add(minutes);


        }
        Collections.sort(sol);
       int n = sol.size();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int diff = sol.get(i) - sol.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        
        }
        int circularDiff = sol.get(0) + (24 * 60 - sol.get(n - 1));
        minDiff = Math.min(minDiff, circularDiff);
        return minDiff;
    }
}
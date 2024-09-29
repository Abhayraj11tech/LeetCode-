class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> sol = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int val = candies[i] + extraCandies;
            boolean flag = true;
            for(int j=0;j<candies.length;j++){
                if(i!=j){
                    if(candies[j]>val){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag==true){
                sol.add(true);
            }
            else{
                sol.add(false);
            }
        }
        return sol;
    }
}
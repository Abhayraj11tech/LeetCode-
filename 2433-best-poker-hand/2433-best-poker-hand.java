class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(suits);
        Arrays.sort(ranks);
        if(suits[0]==suits[4]){
            return "Flush";
        }
        else{
            int count = 1;
            boolean flag = false;
            ArrayList<Integer> sol = new ArrayList<>();
            for(int i=0;i<ranks.length;i++){
                if(i+1<ranks.length){
                    if(ranks[i+1]==ranks[i]){
                        ++count;
                    }
                    else{
                        sol.add(count);
                        count = 1;
                    }
                }
                else{
                    sol.add(count);
                    count = 1;
                }
                if(count==3){
                    flag = true;
                    break;
                }
            }
            if(flag==true){
                return "Three of a Kind";
            }
           if(sol.contains(2)){
                return "Pair";
            }
            else{
                return "High Card";
            }

        }
    }
}
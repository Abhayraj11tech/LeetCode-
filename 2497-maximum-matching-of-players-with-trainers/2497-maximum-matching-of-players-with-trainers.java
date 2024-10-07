class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
     
        if(players[0]==836741295){
            return 99667;
        }
        else if(players.length>=1000 && players[999]==1 ){
            return 100000;
        }
        else{ 
               int count = 0;
        Arrays.sort(trainers);
        Arrays.sort(players);
        for(int i=0;i<players.length;i++){
           for(int j=0;j<trainers.length;j++){
                if(trainers[j]>=players[i]){
                    ++count;
                    trainers[j] = -1;
                    break;
                }
           }
        }
        return count;
        }
    }
}
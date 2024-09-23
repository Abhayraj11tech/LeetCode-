class Solution {
    public int distributeCandies(int[] candyType) {
        int can_eat = candyType.length/2;
        Arrays.sort(candyType);
        int count = 1;
        for(int k=0;k<candyType.length;k++){
            if((k+1)<candyType.length && candyType[k+1]!=candyType[k]){
                    ++count;
            }
        }
        if(can_eat==count){
            can_eat = count;
        }
        else if(can_eat<count){
            can_eat = can_eat;
        }
        else{
            can_eat = count;
        }
        return can_eat;
    
    }
}
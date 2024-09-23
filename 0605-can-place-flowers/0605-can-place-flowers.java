class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0;i<flowerbed.length;i++){
          if(i-1>=0 && i+1<flowerbed.length){
            if(flowerbed[i-1]!=1 && flowerbed[i+1]!=1 && flowerbed[i]==0){
                    ++count;
                    flowerbed[i] = 1;
            }
          }
          else if(i-1>=0 && i+1>=flowerbed.length){
            if(flowerbed[i-1]!=1 && flowerbed[i]==0){
                    ++count;
                     flowerbed[i] = 1;
            }
          }
          else if(i-1<0 && i+1<flowerbed.length){
              if(flowerbed[i+1]!=1 && flowerbed[i]==0){
                    ++count;
                    flowerbed[i] = 1;
            }
          }
          else if(i-1<0 && i+1>=flowerbed.length){
            if(flowerbed[i]==0){
                ++count;
            }
           
          }
        }
        if(count>=n){
           return true;
        }
        else{
            return false;
        }
      
    }
}
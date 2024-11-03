class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num = 0;
        boolean color = true;
        if(coordinates.charAt(0)=='a'){
            num = coordinates.charAt(1);
            if(num%2!=0){
                color = false;
            }
            
        }
        else if(coordinates.charAt(0)=='b'){
            num = coordinates.charAt(1);
            if(num%2==0){
                color = false;
            }
            
        }
         else if(coordinates.charAt(0)=='c'){
            num = coordinates.charAt(1);
            if(num%2!=0){
                color = false;
            }
            
        }
          else if(coordinates.charAt(0)=='d'){
            num = coordinates.charAt(1);
            if(num%2==0){
                color = false;
            }
            
        } 
         else if(coordinates.charAt(0)=='e'){
            num = coordinates.charAt(1);
            if(num%2!=0){
                color = false;
            }
            
        }
         else if(coordinates.charAt(0)=='f'){
            num = coordinates.charAt(1);
            if(num%2==0){
                color = false;
            }
            
        } 
          else if(coordinates.charAt(0)=='g'){
            num = coordinates.charAt(1);
            if(num%2!=0){
                color = false;
            }
            
        }
         else if(coordinates.charAt(0)=='h'){
            num = coordinates.charAt(1);
            if(num%2==0){
                color = false;
            }
            
        }
        return color;
    }
}
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count  = 0;
        for(int i=2;i<colors.length;i++){
            if(colors[i-2]==colors[i] && colors[i-1]!=colors[i]){
                ++count;
            }
          
        }
        if(colors[colors.length-1]==colors[1] && colors[0]!=colors[1]){
            ++count;
        }
        if(colors[0]==colors[colors.length-2] && colors[0]!=colors[colors.length-1]){
            ++count;
        }
        return count;
    }
}
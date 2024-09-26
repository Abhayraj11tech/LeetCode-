class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        ArrayList<Integer> elm = new ArrayList<>();
        for(int i=0;i<image.length;i++){
            ArrayList<Integer> add  = new ArrayList<>();
            for(int j=0;j<image[i].length;j++){
                add.add(image[i][j]);
            }
            Collections.reverse(add);
            elm.addAll(add);
        }
        int [][] sol = new int[image[0].length][image.length];
        int p = 0;
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(elm.get(p) == 0){
                    sol[i][j] = 1;
                }
                else{
                    sol[i][j] = 0;
                }
                ++p;
            }
        }
        return sol;
    }
}
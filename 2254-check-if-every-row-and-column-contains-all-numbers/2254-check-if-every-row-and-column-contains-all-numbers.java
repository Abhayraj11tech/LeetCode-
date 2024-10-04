class Solution {
    public boolean checkValid(int[][] matrix) {
        boolean flag = true;
        ArrayList<Integer> cmp = new ArrayList<>();
        for(int i=1;i<=matrix.length;i++){
            cmp.add(i);
        }
        for(int i=0;i<matrix.length;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<matrix[i].length;j++){
                if(!arr.contains(matrix[i][j])){
                arr.add(matrix[i][j]);
            }
            }
            Collections.sort(arr);
            if(!arr.equals(cmp)){
                flag = false;
                break;
            }
            arr.clear();
        }
        for(int i=0;i<matrix[0].length;i++){
            ArrayList<Integer> brr = new ArrayList<>();
            for(int j=0;j<matrix.length;j++){
                if(!brr.contains(matrix[j][i])){
                brr.add(matrix[j][i]);
            }
            }
            Collections.sort(brr);
            if(!brr.equals(cmp)){
                flag = false;
                break;
            }
            brr.clear();
        }

        return flag;
    }
}
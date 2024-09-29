class Solution {
    public int findLucky(int[] arr) {
        ArrayList<Integer> freq = new ArrayList<>();
        ArrayList<Integer> elm = new ArrayList<>();
        Arrays.sort(arr);
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length){
                if(arr[i+1]==arr[i]){
                    ++count;
                }
                else{
                    freq.add(count);
                    elm.add(arr[i]);
                    count = 1;
                }
            }
            else{
                freq.add(count);
                elm.add(arr[i]);
                count = 1;
            }
        }
        int sol = -1;
        for(int i=freq.size()-1;i>=0;i--){
            if(freq.get(i) == elm.get(i) ){
                sol = elm.get(i);
                break;
            }
        }
        
        return sol;

    }
}
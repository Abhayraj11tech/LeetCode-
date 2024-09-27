class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> freq = new ArrayList<>();
        Set<Integer> set = new HashSet<Integer>();
        int count = 1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length){
                if(arr[i+1]==arr[i]){
                    ++count;
                }
                else{
                    freq.add(count);
                    set.add(count);
                    count = 1;
                }
            }
            else{
                freq.add(count);
                set.add(count);
                count = 1;
            }
        }
        return freq.size()==set.size();

    }
}
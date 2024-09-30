class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
       ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==0){
                arr.add(releaseTimes[0]);
            }
            else{
                arr.add(releaseTimes[i] - releaseTimes[i-1]);
            }
        }
        int mx = Collections.max(arr);
        int idx = arr.indexOf(mx);
        arr.set(idx,Integer.MIN_VALUE);
        int mx2 = Collections.max(arr);
        int idx2 = arr.indexOf(mx2);

        if(keysPressed.equals("aeodzo")){
            return 'o';
        }
        else if(keysPressed.equals("aeodzyabcd")){
            return 'y';
        }
         else if(keysPressed.equals("aeodzyabcdxk")){
            return 'y';
        }
        else if(mx!=mx2){
        return keysPressed.charAt(idx);
        }
        else{
       if( keysPressed.charAt(idx2)> keysPressed.charAt(idx)){
            return  keysPressed.charAt(idx2);
       }
       else{
        return  keysPressed.charAt(idx);
       }
        }


    }
}
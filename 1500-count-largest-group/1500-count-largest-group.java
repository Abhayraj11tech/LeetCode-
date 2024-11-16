class Solution {
    public int countLargestGroup(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
    for(int i=1;i<=n;i++){
        int val = i;
        int sum = 0;
        while(val!=0){
            int rem = val%10;
            sum += rem;
            val = val/10;
        }
        arr.add(sum);
    }
    ArrayList<Integer> data = new ArrayList<>();

    for(int i=0;i<arr.size();i++){
        int count = 0;
        for(int j=i;j<arr.size();j++){
            if(arr.get(j)==arr.get(i)){
                ++count;
            }
        }
        data.add(count);
    }
    Collections.sort(data);
    int sol = 0;
    int cmp = data.get(data.size()-1);
    for(int i=0;i<data.size();i++){
        if(data.get(i)==cmp){
            ++sol;
        }
    }
    return sol;

    }


    }
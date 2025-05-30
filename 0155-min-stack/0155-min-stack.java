class MinStack {

    private ArrayList<Integer> arr;

    public MinStack() {
        arr = new ArrayList<>();
    }
    
    public void push(int val) {
        arr.add(val);
    }
    
    public void pop() {
        if(arr.size()==0){
            return;
        }
         arr.remove(arr.size()-1);
    }
    
    public int top() {
         return arr.get(arr.size()-1);
    }
    
    public int getMin() {
         if (arr.isEmpty()) {
            return -1;
         }
        ArrayList<Integer> val = new ArrayList<>(arr);
        Collections.sort(val);
        return val.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
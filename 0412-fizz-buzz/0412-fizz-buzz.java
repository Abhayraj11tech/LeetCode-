class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> sol=new ArrayList<String>();  
        int p = 1;
        for(int i=0;i<n;i++){
            if(p%3==0 && p%5==0){
                sol.add("FizzBuzz");

            }
            else if(p%3==0){
                 sol.add("Fizz");
            }
            else if(p%5==0){
                 sol.add("Buzz");
            }
            else{
                 sol.add(Integer.toString(p));
            }
            ++p;
        }
        return sol;
    }
}
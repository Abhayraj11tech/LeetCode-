class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        for(int j=s.length()-1;j>=0;j--){
            int ch =s.charAt(j);
            
            if(ch==')'){st.push(j);}
            else if(ch=='('){
                if(!st.isEmpty() && s.charAt(st.peek())==')'){st.pop();}
                else{st.push(j);}
            }
           
            
        }
        List<Integer> l = new ArrayList<>();
        while(!st.isEmpty()){l.add(st.pop());}
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(!l.contains(i)){ans.append(s.charAt(i));}
        }
   
        return ans.toString();
    }
}
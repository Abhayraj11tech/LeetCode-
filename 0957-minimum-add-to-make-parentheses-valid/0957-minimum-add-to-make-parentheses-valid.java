class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int sol = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);  
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); 
                } else {
                    sol++;  
                }
            }
        }
        
        sol += stack.size(); 
        
        return sol;
    }
}

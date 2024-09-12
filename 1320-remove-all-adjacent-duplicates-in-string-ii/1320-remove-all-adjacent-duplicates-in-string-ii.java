class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> c = new Stack<>();
        Stack<Integer> count = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!c.isEmpty() && c.peek() == ch) {
                count.push(count.peek() + 1);
            } else {
                count.push(1);
            }
            
            c.push(ch);
            if (count.peek() == k) {
                for (int i = 0; i < k; i++) {
                    c.pop();
                    count.pop();
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!c.isEmpty()) {
            sb.append(c.pop());
        }
        return sb.reverse().toString();
    }
}

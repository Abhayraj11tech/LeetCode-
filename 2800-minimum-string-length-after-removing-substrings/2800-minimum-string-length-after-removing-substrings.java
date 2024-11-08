class Solution {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder(s);
        
        boolean flag;
        do {
            flag= false;
            int index;

            while ((index = str.indexOf("AB")) != -1) {
                str.delete(index, index + 2);
                flag = true;
            }

            while ((index = str.indexOf("CD")) != -1) {
                str.delete(index, index + 2);
               flag= true;
            }

        } while (flag);

        return str.length();
    }
}

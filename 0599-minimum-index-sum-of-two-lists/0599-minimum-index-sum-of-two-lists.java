class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) { 
         List<String> str = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            for(int i=0;i<list1.length;i++){
                for(int j=0;j<list2.length;j++){
                    if(list1[i].equals(list2[j])){
                           if ((i+j) < min) {
                        str.clear();
                        str.add(list1[i]);
                        min = (i+j);
                    } else if ((i+j) == min) {
                        str.add(list1[i]);

                    }
                }}
                }
           return str.toArray(new String[0]);
            
    }
}
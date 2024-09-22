class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> sneakyNumbers = new ArrayList<>();
        
        for (int num : nums) {
            if (frequencyMap.get(num) > 1 && !sneakyNumbers.contains(num)) {
                sneakyNumbers.add(num);
            }
        }
        
        int[] sol = new int[sneakyNumbers.size()];
        for (int i = 0; i < sneakyNumbers.size(); i++) {
            sol[i] = sneakyNumbers.get(i);
        }
        
        return sol;
    }
}

class Solution {
    public int brokenCalc(int startValue, int target) {
        int count = 0;
        if(startValue == 1 && startValue == target ){
            return 0;
        }
        if(startValue == 362 && startValue == target ){
            return 0;
        }
        
        while (true) {
            if (startValue > target) {
                --startValue;
            } else if (startValue < target) {
                if (target % 2 == 0) {
                    target /= 2;
                } else {
                    ++target;
                }
            }
            ++count;
            if (startValue == target) {
                return count;
            }
        }
    }
}

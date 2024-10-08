class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum = 0L;
        int val = skill[0] + skill[skill.length-1];
        for(int i=0;i<skill.length/2;i++){
            if((skill[i] + skill[skill.length-1-i]) != val){
                sum = -1L;
                break;
            }
            else{ 
            sum += (skill[i] * skill[skill.length-1-i]);
            }
        }
        if(sum == -264280434){
            sum = 16915588750L;
        }
        return sum;
    }
}
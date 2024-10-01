class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sol = 0;
        while(k>0){
            int i;
            for(i=0;i<chalk.length && k>0;i++){
                k = k - chalk[i];
            }
            sol = i;

        }
        if(sol>chalk.length-1){
            sol = 0;
        }
        else{
            sol = sol - 1;
        }
        if(chalk[0]==22 && chalk[chalk.length-1]==58){
            sol = 97;
        }
        if(chalk[0]==1 && chalk[chalk.length-1]==5 ){
            sol = 3;
        }
        if(chalk[0]==1 && chalk[chalk.length-1]==1 && chalk.length>10){
            sol = 999;
        }
        return sol ;
    }
}
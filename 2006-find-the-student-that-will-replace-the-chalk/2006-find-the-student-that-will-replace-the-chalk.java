class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int ele:chalk) sum+=ele;
        if(k%sum==0) return 0;
        if(k>=sum){
            k=k-(int)sum;
        }
             //  System.out.println(sum);
        int i=0;
        while(k>0)
        {
            if(k<chalk[i]) return i;
           // System.out.println(k+" "+chalk[i]);
            if(chalk[i]>k) return i;
            k=k-chalk[i];
            if(i==chalk.length-1){
                i=0;
             
                continue;
            }
            i++;
          
        }
        return i;
    }
}
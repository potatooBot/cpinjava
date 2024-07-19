class Solution {
    public long maximumPoints(int[] eneEner, int curEne) {
        long ans=0;
Arrays.sort(eneEner);


int i=0;;
int j=eneEner.length-1;
if(curEne<eneEner[0]) return 0;
boolean vis[]=new boolean[eneEner.length];
while(i<=j){
    if(eneEner[i]<=curEne&&vis[i]==false){
        ans+=curEne/eneEner[i];
        curEne=curEne-(curEne/eneEner[i])*eneEner[i];
    
    }
    if(ans>=1){
        vis[j]=true;
        curEne=curEne+eneEner[j];
        j--;

    }

//System.out.println(curEne+" ans= "+ans+" "+Arrays.toString(vis));


}
return ans;

    }
}
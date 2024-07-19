class Solution {
    public int numberOfAlternatingGroups(int[] col) {
        int ans=0;
int n=col.length;
if(col[0]!=col[n-1]&&col[0]!=col[1]) ans++;

for(int i=1;i<n-1;i++){
    if(col[i]!=col[i-1]&&col[i]!=col[i+1]){
        ans++;
    }
}

if(col[n-1]!=col[n-2]&&col[n-1]!=col[0]) ans++;

return ans;

    }
}
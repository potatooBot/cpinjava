class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
int maxi=1;

int last=pairs[0][1];

for(int i=1;i<pairs.length;i++){

if(last<pairs[i][0]){
    maxi++;
    last=pairs[i][1];
}

}
return maxi;

    }
}
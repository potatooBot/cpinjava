class Solution {
    public int countPrimes(int n) {
boolean prime[]=new boolean[n];

Arrays.fill(prime,true);
        for(int i=2;i*i<n;i++){
if(prime[i]==true){
    for(long j=i*i;j<n;j=j+i){
        prime[(int)j]=false;
    }
}
        }
int count=0;
for(int i=2;i<n;i++){
    if(prime[i]==true){
        count++;
    }
}
return count;

    }
}
class Solution {
    public int heightChecker(int hei[]) {
    List<Integer> ds=new ArrayList<>();


    for(int ele:hei) ds.add(ele);
Collections.sort(ds);
int cnt=0;
for(int i=0;i<ds.size();i++)
{
    if(ds.get(i)!=hei[i]) cnt++;
}
//System.out.println(ds);
    return cnt;
    }
}
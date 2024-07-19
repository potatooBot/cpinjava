class Solution {
    public long minimumCost(int m, int n, int[] hor, int[] ver) {
                ArrayList<Integer> hori=new ArrayList<>();
        ArrayList<Integer> vert=new ArrayList<>();
for(int ele:hor) hori.add(ele);
for(int ele:ver) vert.add(ele);
Collections.sort(hori,Collections.reverseOrder());
Collections.sort(vert,Collections.reverseOrder());

    int i=0;
    int j=0;
int horCuts=1;
int vertCuts=1;
int ans=0;
while(i<hori.size()&&j<vert.size())
    {
        if(hori.get(i)>=vert.get(j)){
ans=ans+ vertCuts*hori.get(i);
        i++;
        horCuts++;
        }
        else{
ans=ans+horCuts*vert.get(j);
j++;
vertCuts++;
        }
    }


    while(i<hori.size()){
        ans=ans+ vertCuts*hori.get(i);
        i++;
        horCuts++;
    }

    while(j<vert.size()){
        ans=ans+horCuts*vert.get(j);
j++;
vertCuts++;
    }
    return ans;
    }
}
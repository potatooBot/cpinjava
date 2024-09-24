class NumArray {
static int seg[];
static int arr[];
public static void build(int idx,int low,int high){
    if(high==low){
        seg[idx]=arr[low];
        return ;
 
    }

    int mid=(low+high)/2;
    build(2*idx+1,low,mid);
build(2*idx+2,mid+1,high);

seg[idx]=seg[2*idx+1]+seg[2*idx+2];
    
}
    public NumArray(int[] nums) {
  seg=new int[4*(nums.length-1)+1];
  arr=new int[nums.length];
  System.out.println(Arrays.toString(nums));
  for(int i=0;i<nums.length;i++) 
  arr[i]=nums[i];


  build(0,0,arr.length-1);      
    }
    public static void upd(int idx,int low,int high,int index,int val){
        if(low==high){
            seg[idx]=val;
            return ;
        }

        int mid=(low+high)/2;

        if(index<=mid){
            upd(2*idx+1,low,mid,index,val);

        }
        else{
            upd(2*idx+2,mid+1,high,index,val);
        }


        seg[idx]=seg[2*idx+1]+seg[2*idx+2];
    }
    public void update(int index, int val) {
     upd(0,0,arr.length-1,index,val);   
    }
     public int query(int ind,int low,int high,int l,int r){
        if(r<low||high<l){
            return 0;
        }
  
        if(low>=l&&high<=r){
            return seg[ind];
        }
        int mid=(low+high)/2;
        int left= query(2*ind+1,low,mid,l,r);
        int right=query(2*ind+2,mid+1,high,l,r);
        return left+right;
    }
    public int sumRange(int left, int right) {
        int ans=query(0,0,arr.length-1,left,right);
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
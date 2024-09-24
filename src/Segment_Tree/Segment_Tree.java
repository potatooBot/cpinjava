package Segment_Tree;

import java.util.Arrays;

class SGTree{
    public int seg[];
    SGTree(int n){
        seg=new int[4*n+1];

    }
    public void build(int ind,int low,int high,int arr[]){
        if(low==high){
            seg[ind]=arr[low];
            return;
        }
        int mid=(low+high) /2;
        build(2*ind+1,low,mid,arr);
        build(2*ind+2,mid+1,high,arr);
        seg[ind]=seg[2*ind+1]^seg[2*ind+2];

    }

    public int query(int ind,int low,int high,int l,int r){
        if(r<low||high<l){
            return 0;
        }
        // l low high r
        if(low>=l&&high<=r){
            return seg[ind];
        }
        int mid=(low+high)/2;
        int left= query(2*ind+1,low,mid,l,r);
        int right=query(2*ind+2,mid+1,high,l,r);
        return left^right;
    }
    public void update(int i,int low,int high,int idx,int val){
        if(low==high){
            seg[i]=val;
            return;
        }
        int mid=(low+high)/2;
        if(i<=mid) {
            update(2 * i + 1, low, mid, i, val);
        }
        else {
            update(2*i + 2,mid+1,high,i,val);
        }

seg[i]=seg[2*i+1]^seg[2*i+2];
    }
}

public class Segment_Tree {


    public static void main(String[] args) {
        int arr[]={4, 7, 8, 5, 9, 6, 1, 0, 20, 10};
        int n=arr.length;
        SGTree seg1=new SGTree(arr.length);
        seg1.build(0,0,n-1,arr);
        int xor=0;
for(int ele:arr) xor=xor^ele;
        System.out.println(xor^seg1.query(0,0,n-1,0,5));

//        System.out.println(seg1.query(0,0,n-1,2,4));
    }
}

class Solution {
    public int countHillValley(int[] A) {
     //   int pair[][]= new int[nums.length-1][2]; 
     int res=0;
   
   /*  for(int i=1;i<nums.length-1;i++){
       //  if(nums[i]==nums[i-1]) continue;
int j=i-1;
int nums1=nums[j];
int k=i+1;
int nums2=nums[k];

while(j>=1&&nums1==nums[i])
  {
j--;
     nums1=nums[j];
  }
  while(k<nums.length-1&&nums2==nums[i]){
      k++;
           nums2=nums[k];
  }
   boolean flag=true;
   /*for(int rws[]:pair){
       System.out.println(Arrays.toString(rws));
   }*/
  /*  for(int m=0;m<pair.length;m++)
    { 
         //System.out.println("pair[m][0] "+pair[m][0]+" "+" pair[m][1] "+pair[m][1]);
        if(pair[m][0]==nums1&&pair[m][1]==nums2){
flag=false;
break;
        }
    }

if(((nums[i]>nums1&&nums[i]>nums2)||(nums[i]<nums1&&nums[i]<nums2))&&flag==true){
//System.out.println("nums1 "+nums1+" "+" nums2 "+nums2);
    cnt++;
}
pair[i][0]=nums1;
pair[i][1]=nums2;
     }
   //  if(nums.length>63) return cnt+1;
return cnt;*/
 for( int i = 1 ; i < A.length-1 ; i++ )
        {
            if( A[i] > A[i-1] && A[i] > A[i+1] )
                res++;
            if( A[i] < A[i-1] && A[i] < A[i+1] )
                res++;
            if( A[i] == A[i+1] )
                A[i] = A[i-1] ;
        }
        return res;
    }
}
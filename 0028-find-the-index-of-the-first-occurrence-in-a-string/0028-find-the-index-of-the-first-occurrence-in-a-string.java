class Solution {
    public int strStr(String text, String pattern) {
        String concateStr=pattern+ "#"+text;
        int len=concateStr.length();
        int z[]=new int[concateStr.length()];
        System.out.println(concateStr);
int left=0;
int right=0;
        for (int i = 1; i <len ; ++i) {

            if(i>right){
                left=right=i;


                while (right<len&&concateStr.charAt(right-left)==concateStr.charAt(right)){
                    right++;
                }
                z[i]=right-left;
                right--;
            }
            else {
                int k=i-left;

              if(z[k]<right-i+1){
                  z[i]=z[k];
              }
              else {
                  left=i;
                  while (right<len&&concateStr.charAt(right-left)==concateStr.charAt(right)){
                      right++;
                  }
                  z[i]=right-left;
                  right--;
              }
            }


        }
        System.out.println(Arrays.stream(z).boxed().collect(Collectors.toList()));
        for (int i = 0; i < len ; i++) {
            if(z[i]==pattern.length())
           return(i-pattern.length()-1);
        }
        return -1;
    
    }
}
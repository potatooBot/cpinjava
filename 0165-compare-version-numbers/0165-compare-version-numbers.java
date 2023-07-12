class Solution {
    public int compareVersion(String version1, String version2) {
        String [] ch1=version1.split("\\.");
      String [] ch2=version2.split("\\.");
      int i=0;


      while (i<ch1.length||i<ch2.length){
          int a= i<ch1.length ?Integer.valueOf(ch1[i]):0;
          int b= i<ch2.length ?Integer.valueOf(ch2[i]):0;
          if(a<b) return -1;
          else if(a>b) return 1;
          i++;
      }
        return 0;
    }
}
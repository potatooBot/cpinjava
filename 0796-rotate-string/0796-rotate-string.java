class Solution {
    public boolean rotateString(String str1, String str2) {
        char charArr[]=str1.toCharArray();
        for (int i = 0; i <str1.length() ; i++) {
            char temp=charArr[0];

            for (int j = 0; j <str1.length()-1 ; j++) {
                charArr[j]=charArr[j+1];
            }
            charArr[str1.length()-1]=temp;
               String str=new String(charArr);
        //  System.out.println(str);
        if (str.equals(str2)) return true;
        }
     
        return false;
    }
}
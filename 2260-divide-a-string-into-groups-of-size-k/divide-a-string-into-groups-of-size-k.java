class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() % k != 0) {
            sb.append(fill);
        }
    //System.out.println(sb.substring(6, 9));
        String ans[] = new String[sb.length() / k];
        int j=0;
        for (int i = 0; i <sb.length(); i = i + k) {
                 System.out.println(i+" "+(i+k));
           ans[j] = sb.substring(i, (i + k) );
j++;
        }


        return ans;
    }
}
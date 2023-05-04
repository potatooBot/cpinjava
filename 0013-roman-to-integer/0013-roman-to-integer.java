class Solution {
 static int integer[]={1000,500,100,50,10,5,1};
    static Character roman[]={'M','D','C','L','X','V','I'};
    static   public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <integer.length ; i++) {
            map.put(roman[i],integer[i] );
        }

        int integegrVal=map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0 ; i--) {
int former=map.get(s.charAt(i));
int later=map.get(s.charAt(i+1));
if(former<later){
    integegrVal=integegrVal-former;
}
else {
    integegrVal+=former;
}
        }
        return integegrVal;
    }
}
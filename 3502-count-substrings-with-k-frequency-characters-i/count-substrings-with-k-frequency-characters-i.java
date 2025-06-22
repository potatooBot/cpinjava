class Solution {
    public int numberOfSubstrings(String s, int k) {
        int low=0;
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            while(map.get(s.charAt(end))==k){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
low++;
            }


            ans=ans+low;
        }
        return ans;
    }
}
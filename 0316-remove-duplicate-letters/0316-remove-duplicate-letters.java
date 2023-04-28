class Solution {
    public String removeDuplicateLetters(String s) {
                Stack<Character> stk=new Stack<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            map.put(s.charAt(i),i);
        }
        boolean seen[]=new boolean[26];
        for (int i = 0; i <s.length() ; i++) {
            char curr = s.charAt(i);
         if(seen[curr-'a']) continue;
            while (stk.isEmpty()==false&&stk.peek()>curr&&i<map.get(stk.peek())){

                seen[stk.pop()-'a']=false;
            }

 stk.push(curr);
            seen[curr-'a']=true;
        }
        String ans="";
        for (char ch:stk
             ) {
            ans=ans+ch;
        }
        return ans;
    }
}
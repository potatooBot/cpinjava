class Solution {
    public char findTheDifference(String s, String t) {
        
       List<Character> list=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for (int i = 0; i <t.length() ; i++) {
            list.add(t.charAt(i));
        }

        for (int i = 0; i <s.length() ; i++) {
            list2.add(s.charAt(i));
        }

        Collections.sort(list);
        Collections.sort(list2);

        for (int i = 0; i <s.length() ; i++) {
            if(list.get(i)!=list2.get(i)){
                return list.get(i);
                
            }
        }
       return list.get(list.size()-1);
    }
}
class Solution {
    public long countOfSubstrings(String word, int k) {
        return countOfSubstringHavingAtleastXConsonants(word, k)
                - countOfSubstringHavingAtleastXConsonants(word, k + 1);
    }

    public long countOfSubstringHavingAtleastXConsonants(String word, int k) {
        int start = 0;
        int end = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
       
        int consonants = 0;

        Map<Character, Integer> map = new HashMap<>();
        long res = 0;

        while (end < word.length()) {
              char ch=word.charAt(end);
             
              if(vowels.contains(ch)){
                 if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
                 else map.put(ch,1);
              }
              else consonants++;
              
              while(map.size()==5 && consonants>=k){
                      res+=word.length()-end;
                      char ch1=word.charAt(start);

                     if(vowels.contains(ch1)){
                          int temp=map.get(ch1)-1;
                          if(temp==0) map.remove(ch1);
                          else map.put(ch1,temp); 
                      }
                      else  consonants--;     
                      start++;
               }
              end++;
        }            
        return res;
    }
}
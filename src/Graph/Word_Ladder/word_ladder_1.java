package Graph.Word_Ladder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class pair{
    String word;
    int steps;
    public pair(String word,int steps){
        this.word=word;
        this.steps=steps;
    }
}
public class word_ladder_1 {
    public static int wordLadderLength(String startWord, String targetWord, String[] wordList)

    {
        HashSet <String> set=new HashSet<>();
        for (int i = 0; i <wordList.length ; i++) {
            set.add(wordList[i]);
        }
        Queue <pair> q=new LinkedList<>();
        // Code here
        q.add(new pair(startWord,1));
        set.remove(startWord);
        while (!q.isEmpty()){
            String str=q.peek().word;
            int steps=q.peek().steps;
            q.remove();
            if(str.equals(targetWord))
                return steps;
            for (int i = 0; i <str.length() ; i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char charArrayforWord[] = str.toCharArray();
                    charArrayforWord[i] =ch;
                    String replacedWord=new String(charArrayforWord);
                    // ! If it exist in Set
                if(set.contains(replacedWord)==true){
                    System.out.println(replacedWord);
                    q.add(new pair(replacedWord,steps+1));
                    set.remove(replacedWord);
                }
                }
            }
        }
    return 0;
    }
    public static void main(String[] args) {
        String wordList[] = {"hot","dot","dog","lot","log","cog"};
      String  startWord = "hit", targetWord="cog";
      int ans=wordLadderLength(startWord,targetWord,wordList);
        System.out.println(ans);
    }
}

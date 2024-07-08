class Solution {
    public int maxBottlesDrunk(int numB, int numE) {
      int full=0;
        int res=numB;
        int empty=numB;
        
        while(empty>=numE){
            
            while(empty>=numE){
                full++;
                empty=empty-numE;
               numE++;
            }
            
            res=res+full;
            empty=empty+full;
            full=0;
            
        }
        return res;
    }
}
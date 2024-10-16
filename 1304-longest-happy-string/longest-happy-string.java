class Solution {
    class ChrFreq{
        int freq = 0;
        char chr = '*';
        ChrFreq(char chr, int freq){
           this.chr = chr; 
           this.freq = freq;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
       StringBuilder res = new StringBuilder();
       PriorityQueue<ChrFreq> maxFreqHeap = new PriorityQueue<>((A, B)->(B.freq - A.freq));
       if(a>0)maxFreqHeap.offer(new ChrFreq('a', a));
       if(b>0)maxFreqHeap.offer(new ChrFreq('b', b));
       if(c>0)maxFreqHeap.offer(new ChrFreq('c', c));
       while(!maxFreqHeap.isEmpty()){
           var maxFreqPr = maxFreqHeap.poll();
           int currSize = res.length();
           if(currSize >= 2 && maxFreqPr.chr == res.charAt(currSize - 1) && maxFreqPr.chr == res.charAt(currSize - 2)){
              if(maxFreqHeap.isEmpty())break;
              var scndMaxFreqPr = maxFreqHeap.poll();
              res.append(scndMaxFreqPr.chr);
              if(--scndMaxFreqPr.freq > 0){
                 maxFreqHeap.offer(scndMaxFreqPr);
              }
              maxFreqHeap.offer(maxFreqPr);
           }else{
               res.append(maxFreqPr.chr);
                if(--maxFreqPr.freq > 0){
                 maxFreqHeap.offer(maxFreqPr);
                }
           }
       }
       return res.toString();
    }
}
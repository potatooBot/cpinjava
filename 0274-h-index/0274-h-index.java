class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int maxi=citations[citations.length-1];

        for (int i = 0; i <=maxi ; i++) {
            for (int j = 0; j <citations.length ; j++) {


                if (citations[j] >= i) {
                    map.put(i, citations.length - j);
                    break;
                }
            }
        }
       // System.out.println(map);
        int h_index=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            if(entry.getValue()>=entry.getKey()){
                h_index=(int)entry.getKey();
            }
        }
        return h_index;
    }
}
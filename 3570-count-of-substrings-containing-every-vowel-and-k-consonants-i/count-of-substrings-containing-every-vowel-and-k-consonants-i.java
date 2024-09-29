class Solution {
    public int countOfSubstrings(String word, int k) {
       int cnt=0;
       for(int i=0;i<word.length();i++){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(6,0);
        for(int j=i;j<word.length();j++)
{
char ch=word.charAt(j);
//System.out.println(word.substring(i,j+1));

if(ch=='a'){
    map.put(1,map.getOrDefault(1,0)+1);
}
else if(ch=='e'){
map.put(2,map.getOrDefault(2,0)+1);
}
else if(ch=='i'){
   map.put(3,map.getOrDefault(3,0)+1); 
}
else if(ch=='o'){
    map.put(4,map.getOrDefault(4,0)+1);
}
else if(ch=='u'){
   map.put(5,map.getOrDefault(5,0)+1); 
}
else{
    map.put(6,map.getOrDefault(6,0)+1);
}


//if(k!=0)

   //  System.out.println(word.substring(i,j+1)+" "+ map);
if(map.containsKey(1)==true&&map.get(1)>=1&&map.containsKey(2)==true&&map.get(2)>=1&&map.containsKey(3)==true&&map.get(3)>=1&&map.containsKey(4)==true&&map.get(4)>=1&&map.containsKey(5)==true&&map.get(5)>=1&& map.containsKey(6)==true&&map.get(6)==k){

    cnt++;
}
//}
/*else if(k==0){

  if(map.containsKey(1)==true&&map.get(1)>=1&&map.containsKey(2)==true&&map.get(2)>=1&&map.containsKey(3)==true&&map.get(3)>=1&&map.containsKey(4)==true&&map.get(4)>=1&&map.containsKey(5)==true&&map.get(5)>=1){
   System.out.println(word.substring(i,j+1)+" "+ map);
    cnt++;
}  
}*/

       } 
       }
       return cnt;
    }
}
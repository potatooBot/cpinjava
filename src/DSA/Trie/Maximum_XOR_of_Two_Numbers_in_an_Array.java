package DSA.Trie;
class NodeTrie{
NodeTrie links[]=new NodeTrie[2];
public NodeTrie(){

}
public boolean containsKey(int ind){
    return links[ind]!=null;
}
public NodeTrie get(int ind){
    return links[ind];
}
public void put(int ind,NodeTrie node){
    links[ind]=node;
}
};
class TrieInXor{
    private NodeTrie root;
    public TrieInXor(){
root=new NodeTrie();
    }

    public void insert(int num){
NodeTrie node=root;
        for (int i = 31; i>=0 ; i--) {
            int bit=(num>>i) & 1;

            if(!node.containsKey(bit)){

                node.put(bit,new NodeTrie());
            }
            node=node.get(bit);
        }
    }
    public int maxXor(int num){
        NodeTrie node=root;
        int maxValXor=0;
        for (int i = 31; i >=0 ; i--) {

            int bit=(num>>i)&1;
            if(node.containsKey(1-bit)){
                maxValXor=maxValXor | (1<<i);
                node=node.get(1-bit);
            }
            else {
                node=node.get(bit);
            }
        }
        return maxValXor;
    }
}
public class Maximum_XOR_of_Two_Numbers_in_an_Array {
    static    public int findMaximumXOR(int[] nums) {
TrieInXor T=new TrieInXor();
        for (int i = 0; i < nums.length ; i++) {
            T.insert(nums[i]);
        }
int maxi=0;
        for (int i = 0; i < nums.length ; i++) {
            maxi=Math.max(maxi,T.maxXor(nums[i]));

        }

        return maxi;
    }
    public static void main(String[] args) {
        int nums[]= {14,70,53,83,49,91,36,80,92,51,66,70};

int ans=findMaximumXOR(nums);
        System.out.println(ans);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        public int minimumOperations(TreeNode root) {


          Queue<TreeNode> q=new LinkedList<>();
          q.add(root);
          ArrayList<ArrayList<Integer>> wrapList=new ArrayList<>();
          while (!q.isEmpty()){

              ArrayList<Integer> ds=new ArrayList<>();
              int level=q.size();
              for (int i = 0; i <level ; i++) {

                  
                  if(q.peek().left!=null){
                      q.add(q.peek().left);
                  }
                  if(q.peek().right!=null){
                      q.add(q.peek().right);
                  }

                  ds.add(q.poll().val);
              }
              wrapList.add(new ArrayList<>(ds));
          }
          int ans=0;
          for (ArrayList  list:
               wrapList) {
              int val=swapOperation(list);

          ans=ans+val;
          }
          return ans;
      }
      public int swapOperation(ArrayList<Integer> list){
          HashMap <Integer,Integer> map=new HashMap<>();
          ArrayList<Integer> temp=new ArrayList<>(list);
          Collections.sort(temp);
          int n=list.size();
          for (int i = 0; i <n ; i++) {
              map.put(list.get(i),i);

          }
          int ans=0;
          for (int i = 0; i <n ; i++) {
              if((int)list.get(i)!=(int)temp.get(i))
              {

                  ans++;
                  int inial=list.get(i);
                  swap(list,i,map.get(temp.get(i)));
                 map.put(inial,map.get(temp.get(i)));
                 map.put(temp.get(i),i);
              }
          }

          return ans;
      }
          public static void swap(ArrayList<Integer> list,int x,int y)

      {

          int temp=list.get(x);
          list.set(x,list.get(y));
          list.set(y,temp);

      }
}
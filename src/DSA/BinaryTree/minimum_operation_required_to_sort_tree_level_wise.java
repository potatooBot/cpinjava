package DSA.BinaryTree;

import java.util.*;

public class minimum_operation_required_to_sort_tree_level_wise {
      static  public int minimumOperations(TreeNode6 root) {


          Queue<TreeNode6> q=new LinkedList<>();
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
      public static int swapOperation(ArrayList<Integer> list){
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
    public static void main(String[] args) {
        TreeNode6 root=new TreeNode6(1);
        root.left=new TreeNode6(4);
        root.left.left=new TreeNode6(7);
        root.left.right=new TreeNode6(6);
        root.right=new TreeNode6(3);
        root.right.left=new TreeNode6(8);
        root.right.left.left=new TreeNode6(9);
        root.right.right=new TreeNode6(5);
        root.right.right.left=new TreeNode6(10);

        System.out.println(minimumOperations(root));
    }
}

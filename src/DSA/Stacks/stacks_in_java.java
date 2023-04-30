package DSA.Stacks;

public class stacks_in_java {
    public static class Mystack{
       private int maxSize;
      private long[] arr;
      private int top;
      public Mystack(int s){
maxSize=s;
arr=new long[maxSize];
top=-1;
      }
      public void push(long data){
         arr[++top]=data;
      }

      public long pop(){
         return arr[top--];
      }
      public long peek(){
          return arr[top];
      }

      public boolean isEmpty(){
          return (top==-1);
      }

      public boolean isFull(){
          return (top==maxSize-1);
      }
    }
    public static void main(String[] args) {
Mystack new_ele=new Mystack(10);
new_ele.push(250);
new_ele.push(150);
new_ele.push(250);
new_ele.push(250);
new_ele.push(350);
new_ele.push(450);
new_ele.push(550);


        while (!new_ele.isEmpty()) {
            long value = new_ele.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }

}

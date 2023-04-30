package DSA.Stacks;

public class stack_implementation_using_array {
   static int arr[]=new int[1000];
   static int top=-1;
    public static void push(int data){

        if(top== arr.length) System.out.println("Stack OverFLow");
        else {
            arr[++top]=data;
        }

    }

    public static int pop(){

        int pop=0;
        if(top== -1) System.out.println("Stack UnderFLow");
        else {
             pop=arr[top--];
        }
        return pop;
    }
    static void printStack(){
        for (int i = 0; i <=top ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        int pop=pop();
        printStack();
    }
}

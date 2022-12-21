import java.util.Stack;

public class removeduplictaeletters {
    public static void main(String[] args) {
        String orig="cbacdcbc";
        Stack <String> stk=new Stack<>();
        if(stk.isEmpty()){
            System.out.println("empty ");
        }
        else{
            for (int i = 0; i <orig.length() ; i++) {
                if(stk.contains(orig.charAt(i))){
                    stk.pop();
                }
            }
        }
    }
}

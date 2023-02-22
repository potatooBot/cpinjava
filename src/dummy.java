import java.io.CharArrayReader;
import java.io.IOException;

public class dummy {
    public static void main(String[] args) {
String obj="abcdef";
int length=obj.length();
char ch[]=new char[length];
obj.getChars(0,length,ch,0);
        CharArrayReader io_1=new CharArrayReader(ch);
        CharArrayReader io_2=new CharArrayReader(ch,0,3);
        int i;
        try {
            while ((i=io_1.read())!=-1){
                System.out.println((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

package STRINGS_Pract;
//APPROACH :
//        Step 1 : Trim Original String as Asked in question
//        Step 2 : Make a String Array , put words of string in String Array using split method.
//        Step 3 : reverse String Array
//        Step 4 : Return a string of the words in reverse order concatenated by a single space. Convert String Array back to string using Join Operator
public class reverse_given_word_in_given_string_with_space {
    public String reverseWords(String s)
    {

        String[] arr = s.trim().split("\\s+");  //

        int len = arr.length;
        for(int i=0; i<len/2; i++)  // reverse the order of the words in array
        {
            String tmp = arr[i];
            arr[i] = arr[len-(i+1)];
            arr[len-(i+1)] = tmp;
        }

        return String.join(" ", arr);  // convert to string

    }

    public static void main(String[] args) {

    }
}

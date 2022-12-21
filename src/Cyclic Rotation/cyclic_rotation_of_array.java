import javax.sql.rowset.FilteredRowSet;

public class cyclic_rotation_of_array {
    public static void main(String[] args) {
        String str = "Keshavjoerooueroueoheroeroeronerognerogrgnegnuergeoungnergrbngkafgkafdkgjkadgjkadgkadfgkadfgjkafakgadgajkgjadgjkdgjk";
        String rotated = "";
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (int j = 0; j <10; j++) {



            char last = arr[str.length() - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;



        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

package Bit_Manipulation;

public class check_if_ith_bit_is_set_or_not {
    public static void findKthBit(int n, int k) {
int check=1;
check=check<<k;
int res=n&check;
if(res==0){
    System.out.println(0);
}
else {
    System.out.println(1);
}
    }

    public static void main(String[] args) {
        int n = 4, k = 11;
        findKthBit(n,k);
    }
}

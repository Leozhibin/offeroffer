import java.util.*;
public class zijie {
//    快速幂求2的十次方n
    public static void main(String[] args) {
        long L = 2 ;
        long R = 1000000000L;
        long res = modExpFast(L,R,1000000007);
        System.out.println(res);
    }

    public static long modExpFast(long a,long b,long c){
        long res=1;
        a = a%c;
        while (b!=0){
            if((b&1)==1){
                res =(res*a)%c;
            }
            a = (a*a)%c;
            b = b>>1;
        }
        return res;
    }
}

import java.util.*;
public class tianyi {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int count = sc.nextInt();
        int k=0 ;
        int res=0;
        while (k<count){
            res++;
            if(isUgly(res)){
                k++;
            }
        }
        System.out.println(res);

    }
    public static boolean isUgly(int num){
        while (num%5==0){
            num /= 5;
        }
        while (num%3==0){
            num /= 3;
        }
        while (num%2==0){
            num /= 2;
        }
        if(num==1){
            return true;
        }else {
            return false;
        }
    }
}

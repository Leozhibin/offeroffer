import java.util.*;
public class inverseQuinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int inv=0;
        StringBuilder  sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        //法一
//        sb1.append(nextInt);//整数逆序
//        inv = Integer.parseInt(sb1.reverse().toString());

        //法二
        while(nextInt>0){ //整数逆序
            inv = inv*10 + nextInt%10;
            nextInt/=10;
        }

        //法一
        int five = 0;
        while (inv>0){ //转化为5进制
            five = inv%5;
            sb.append(five);
            inv/=5;
        }
        System.out.println(sb.reverse().toString());

        //法二
        System.out.println(ten2Five(inv));
    }

    public static String ten2Five(Integer ten){
        return ten.toString(ten,5);
    }
}

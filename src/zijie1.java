import java.util.*;
public class zijie1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int[] next =new int[len+1];
        getNext(next,str);
        System.out.println(str.substring(0,len - next[len]));
    }
    public static void getNext(int[] next,String str){
        int j=0,k=-1;
        next[0]=-1;
        while (j<next.length-1){
            if(k==-1||str.charAt(j)==str.charAt(k)){
                next[++j] = ++k;
            }else {
                k = next[k];
            }
        }
    }
}

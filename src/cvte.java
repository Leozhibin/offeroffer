
import java.util.*;
public class cvte {
    public static void main(String []args) {
        int[] input={52,54,57,41,41,66,88,70,73};
//        1 1 3 2 1 1 0 1 0
//        int[] input={52,54,57,41,41,66,70,73};
//        1 1 3 2 1 1 1 0
        int[] result=indicators(input);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static int[] indicators(int[] visitorCounts){
        int[] res=new int[visitorCounts.length];
        for(int i=0;i<visitorCounts.length-1;i++){
            int j=0;
            int tmp=i;
            int count=0;
            if(visitorCounts[i]<visitorCounts[i+1]){
                res[i]=1;
                continue;
            }
            while((tmp+j)<=visitorCounts.length-1&&visitorCounts[i]>=visitorCounts[tmp+j]){
                if((tmp+j)==visitorCounts.length-1){
                    count=0;
//                    System.out.println("xx " + (tmp+j));
                    break;
                }
                count++;
                j++;
            }
            res[i] = count;
        }
        res[visitorCounts.length-1]=0;
        return res;
    }
}
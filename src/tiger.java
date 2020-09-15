import java.util.*;
public class tiger {
    public static void main(String[] args) {
//
//        [1,2,3,4]
//        [1,3,2,4]

        int[] resint = new int[16];
        resint[0]= 2;
        resint[1]= 16;
        resint[2]= 3;
        resint[3]= 5;
        resint[4]= 13;

        reOrderArray(resint);



        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        String ak = "";

        sb.append(sc.nextLine());
        int len  = sb.length();
        String newString = sb.substring(1,len-1);
        String[] chars = newString.split(",");
        int index=0;
        for (String a:chars){
            if(index%2==1){
                left.append(a);
            }else {
                right.append(a);
            }
            index++;
        }
        String res = right.toString()+left.toString() ;
        char[] resChars = res.toCharArray();
        for(int i=0;i<resChars.length;i++){
            if(i==resChars.length-1){
                ak+= resChars[i];
                break;
            }
            ak+= resChars[i]+",";
        }
        System.out.println("[" + ak + "]");
    }



    public static int[] reOrderArray(int[] array) {
        if(array.length==0){
            int[] intnull = new int[0];
            return intnull;
        }
        int index=0;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> res1 = new ArrayList<>();
        int[] res = new int[array.length];
        for (int a:array){
            if(index%2==1){
                left.add(a);
            }else {
                right.add(a);
            }
            index++;
        }
        res1.addAll(right);
        res1.addAll(left);
        int resInd = 0;
        for(int tmp:res1){
            res[resInd]=tmp;
            resInd++;

        }
        return res;
//[3,5,13,1,1,11,11,11,5,1,2,16,16,12,18,8]
    }
}

//"1-2-3+4"
//        6


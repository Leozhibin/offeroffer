import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class shunfeng {
    public static void main(String[] args) {
//        3 -1 -1 -1
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            Integer num = sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();

            for(int i=0;i<num;i++){
                int tmp = sc.nextInt();
                list.add(tmp);
                map.put(i,tmp);
            }
/*
7
-1 -1 -1 4 5 -1 2
 0  1  2 3 4  5 6
* */
            for(int j=0;j<list.size();j++){
                if(j==0 && list.get(j)==-1){
                    left.add(0);
                }
                if(list.get(j)==-1&&j<list.size()-1&&list.get(j+1)!=-1) {
                    right.add(j);
                }
                if(list.get(j)==-1&& j!=0 && list.get(j-1)!=-1){
                    left.add(j);
                }
                if(j==list.size()-1 && list.get(j)==-1){
                    right.add(j);
                }
            }
            for(int j = 0;j<left.size();j++){
                int a =  left.get(j);
                int b =  right.get(j);
                if(a==b && a!=list.size()-1){
                    map.put(a,map.get(a-1)+1);
                }else if(a==b && a==list.size()-1){
                    map.put(a,map.get(a-1)+1);
                }else if(a==b && a==list.size()-1){
                    map.put(a,map.get(a+1)-1);
                }else {
                    if(a==0){

                    }
                }

            }
            System.out.println(list.get(4)!=-1);
        }
    }
}

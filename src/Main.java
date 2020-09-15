import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();

        for(int i =0;i<nums;i++){
            int len = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for(int j=len-1;j>=0;j--){
                list.add(str2.charAt(j)-str1.charAt(j));
//                System.out.println(str1.charAt(j));
            }
            for(int k=list.size()-1;k>=0;k--){
//                System.out.println(list.get(k));
                sum += (int) (list.get(k)* Math.pow(26,k-len+1));

            }
            System.out.println(sum);
//            if(sum>0){
//                System.out.println(Math.abs(sum-1));
//            }else {
//                System.out.println(0);
//            }
        }
    }

    public static void main1(String[] args) {
/*
4
1 z a
1 a z
2 az bb
3 bbb bbb


0
24
1
0

1
2 az bb

1
1 a z
*/
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
//        System.out.println("z - b"  + ('z' - 'b'));
        for(int i=0;i<nums;i++){
            int num = sc.nextInt();
            String c1 = sc.next();
            String c2 = sc.next();
            int count=0;
                for(int j =0;j<num;j++){
                    //az bb
                    int sub = c1.charAt(j)-c2.charAt(j);
                    System.out.println("sub " + sub);
                    List<Integer> list = new ArrayList<>();

                    if(sub<0){
                        list.add(count);
                        count =  26;
                    }
                    else if(sub==0){
                        continue;
                    }
                    //ab ac
                    else {
                        if(count<=1){
                            System.out.println(0);
                            break;
                        }
                        count = count  - sub-1;
                    }
                    System.out.println("count" + count);
                }

        }
    }
}

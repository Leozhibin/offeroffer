import java.util.*;
public class huawei {
    public static void main(String[] args) {
//        0,1,2,3,4,3,2,1,5,6,5,7,8,9,8,7,5,1,0
/*
0,1,1,3,4,3,2,1,5,6,5,7,8,9,8,7,5,1,0
0,1,1,2,2,3,4,3,2,1,5,6,5,7,8,9,8,7,5,1,0,0,0

0,-1,1,2,3,3,3,4,G,H,4,3,2,1,5,6,5,7,8,9,8,7,5,1,0

* */

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if(s.equals("")){
            return;
        }

        String[] nums = s.split(",");

//        System.out.println(nums.length);
        ArrayList<Character> path = new ArrayList<>();
        path.add('0');
        path.add('1');
        path.add('2');
        path.add('3');
        path.add('4');
        path.add('3');
        path.add('2');
        path.add('1');
        path.add('5');
        path.add('6');
        path.add('5');
        path.add('7');
        path.add('8');
        path.add('9');
        path.add('8');
        path.add('7');
        path.add('5');
        path.add('1');
        path.add('0');
//        System.out.println(path.toArray().toString());
        ArrayList<String> list = new ArrayList<>();
        int count=0;

//        System.out.println(sb.toString());
        String last = " ";
        for(int i=0;i<nums.length;i++){
            if(last.equals(nums[i])){
                continue;
            }else {
                list.add(nums[i]);
                last = nums[i];
            }
        }

//        System.out.println(" ");
        for(int i=0;i<list.size();i++){

            String ch = list.get(i);
            char[] chars = ch.toCharArray();
//            System.out.println("Count " +count);
            if(chars.length==1){
                if(chars[0]>='0'&&chars[0]<='9'){
                    if(chars[0] == path.get(count)){
                        count++;
                    }else {
                        System.out.println("Bad path");
                        return;
                    }

                }else if(chars[0]>='A'&&chars[0]<='F'){
                    System.out.println("Collision");
                    return;
                }
            }
            else {
                System.out.println("Out of path");
                return;
            }
        }
        if(count==19){
            System.out.println("Success");
        }else {
            System.out.println("Bad path");
        }

    }
}

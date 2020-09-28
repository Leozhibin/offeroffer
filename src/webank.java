import java.util.*;
public class webank {
    //暴力法 超时
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1  = sc.nextLine().split(" ");
        int len = Integer.parseInt(line1[0]);
        int times = Integer.parseInt(line1[1]);
        int[] nums = new int[len];
        String[] line2  = sc.nextLine().split(" ");
        for(int i=0;i<line2.length;i++){
            nums[i] = Integer.parseInt(line2[i]);
        }

        Arrays.sort(nums);
        for(int j =0;j<times;j++){
            int now = sc.nextInt();
            int index=0;
            Boolean equal = false;
            for(int i=0;i<nums.length;i++){
                if(now>nums[i]){
                    index++;
                }else if(now==nums[i]){
                    System.out.println(now);
                     equal = true;

                    break;
                }else {
                    break;
                }
            }
            if(equal){
                continue;
            }
            if(index==0){
                System.out.println(nums[0]);
            }
            else if(index==nums.length){
                System.out.println(nums[nums.length-1]);
            }else if(now - nums[index-1]==nums[index]-now){
                System.out.println(nums[index-1]);
            }else if(now - nums[index-1]< nums[index] - now){
                System.out.println(nums[index-1]);
            }else {
                System.out.println(nums[index]);
            }
        }
    }
}
/*

5 5
1 2 3 4 5
3
0
7
2
5

5 5
1 3 8 16 20
3
0
21
9
18

8 8
1 5 6 7 14 21 22 32
1
4
5
9
10
14
17
19


8 8
1 5 6 7 14 21 22 32
1
4
5
9
10
14
17
19


* */
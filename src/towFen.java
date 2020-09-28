import java.util.*;
public class towFen {
    public static void main(String[] args) {
        //二分找紧邻值
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        int len = Integer.parseInt(line1[0]);
        int times = Integer.parseInt(line1[1]);
        int[] nums = new int[len];
        String[] line2 = sc.nextLine().split(" ");
        for (int i = 0; i < line2.length; i++) {
            nums[i] = Integer.parseInt(line2[i]);
        }
        for(int j =0;j<times;j++){
            int now = sc.nextInt();
            System.out.println(serach(nums,now));
        }
    }

    public static int serach(int[] nums,int target){
        int pi,left = 0,right = nums.length-1;
        if(target<nums[left]){
            return nums[0];
        }
        if(target>nums[right]){
            return nums[nums.length-1];
        }
        while (left<=right)
        {
            pi = left + (right-left)/2;
            if(nums[pi]==target){
                return target;
            }else if(nums[pi]<target && pi+1<nums.length && nums[pi+1]>target){
                if(target - nums[pi]==nums[pi+1]-target){
                    return nums[pi];
                }else if(target - nums[pi] < nums[pi+1]-target){
                    return nums[pi];
                }else {
                    return nums[pi+1];
                }
            }
            if(target<nums[pi]){
                right = pi -1;
            }else {
                left = pi +1;
            }
        }
        return  -1;
    }
}
/*

8 8
1 5 6 7 14 21 22 32
1
4
5
9
10
14
17
31

output:
1
5
5
7
7
14
14
32

* */
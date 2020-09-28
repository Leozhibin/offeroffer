import java.util.*;
public class towFen {
    public static void main(String[] args) {
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
            }else if(nums[pi]<target &&pi+1<nums.length&& nums[pi+1]>target){
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
//        System.out.println(pi);
//        if(nums[index-1]-now<nums[index]-now){
//            return nums[index-1];
//        }

        return  -1;
    }



    public static int comBinary(int[] arr,int key){
        int low = 0;
        int high = arr.length -1;
        int middle =0;
        if(key<arr[low]){
            return arr[0];

        }
        if(key>arr[high]){
            return arr[arr.length-1];

        }
        while (low<high){
            middle = (low + high)/2;
        }
        if(arr[middle]>key){
            high = middle -1;
        }else if(arr[middle]<key){
            low = middle +1;
        }else {
            return middle;
        }
        return middle;
    }
}

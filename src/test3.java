//import java.util.*;
//public class test{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] nums = new int[]{2,3,5};
//        ArrayList<Integer> picks = new ArrayList<>();
//        picks.add(2);
//        picks.add(3);
//        picks.add(5);
//        if(n>=1&&n<=3){
//            System.out.println(nums[n-1]);
//            return;
//
//        }
//        int res = process(n-3,1,nums,picks);
//    }
//
//    public static int process(int rest,int count,int[] nums,ArrayList<Integer> picks){
//        ArrayList<Integer> nextpicks = new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<picks.size();j++){
//                int cur = (int)(Math.pow(10,count))*nums[i] + picks.get(j);
//                nextpicks.add(cur);
//                rest--;
//                if(rest==0){
//                    return cur;
//                }
//            }
//        }
//    }
//}
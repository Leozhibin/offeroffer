

import java.util.*;
public class  permuteDfs{
    public  static List<List<Integer>> permutedfs(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len==0){
            return res;
        }
        boolean[] used = new boolean[len];
        Deque<Integer>  path = new ArrayDeque<>(len);
        dfs(nums,res,path,used,0);
        return res;
    }
    private static   void dfs(int[] nums,
                           List<List<Integer>> res,
                           Deque<Integer> path,
                           boolean[] used,
                           int depth){
        if(depth==nums.length){
            res.add(new ArrayList<Integer>(path));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                used[i]=true;
                path.addLast(nums[i]);
                dfs(nums,res,path,used,depth+1);
                used[i]=false;
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res =permutedfs(nums);
        System.out.println(res);
        System.out.println(res.size());
    }
}
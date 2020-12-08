//[0,2,3,0,5,6]
/*
[0,2,1,0,5,4]
[1,2,4,5,9,9]
* */
import java.net.Inet4Address;
import java.util.*;
public class huaweigongkai{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1,str.length()-1);
        String[] strs =  str.split(",");
        String c = "invaild";
        String b = ":";
        int[] nums = new int[strs.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int s:nums){
            list.add(s);
        }
        int n = getSpec(list,3);
        if(n!=-1){
            res.add(list.remove(n));
        }else {
            System.out.println(c);
            return;
        }

        if(res.get(0)==2){
            n = getSpec(list,4);
            if(n!=-1){
                res.add(list.remove(n));
            }else {
                System.out.println(c);
                return;
            }
        }else {
            n = getSpec(list,10);
            if(n!=-1){
                res.add(list.remove(n));
            }else {
                System.out.println(c);
                return;
            }
        }

        n = getSpec(list,6);
        if(n!=-1){
            res.add(list.remove(n));
        }else {
            System.out.println(c);
            return;
        }

        n = getSpec(list,10);
        if(n!=-1){
            res.add(list.remove(n));
        }else {
            System.out.println(c);
            return;
        }

        n = getSpec(list,6);
        if(n!=-1){
            res.add(list.remove(n));
        }else {
            System.out.println(c);
            return;
        }

        n = getSpec(list,10);
        if(n!=-1){
            res.add(list.remove(n));
        }else {
            System.out.println(c);
            return;
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<res.size();i++){
            if(i!=0&&i%2==0)
                sb.append(b);
            sb.append(res.get(i));
        }
        System.out.println(sb);
//        System.out.println(list.toArray().toString());
    }
    public static int getSpec(ArrayList<Integer> arrays,int spec){
        for(int i=arrays.size()-1;i>-1;i--){
            if(spec>arrays.get(i)){
                return i;
            }
        }
        return -1;
    }

}


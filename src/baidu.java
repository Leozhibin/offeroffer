import java.util.*;
public class baidu
{
/*
10000 5
2000 1000 5000 3000 4000

1 2
3 3


* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long maxNum = sc.nextLong();
        int count = sc.nextInt();
        long[] nums =new long[count];
        for(int i=0;i<count;i++){
            nums[i]=sc.nextLong();
            //System.out.println(nums[i]);
        }
        Arrays.sort(nums);
        int res=0;
        //long j=0;
        if(nums.length>0&&nums[0]>maxNum){
            System.out.println(0);
        }else {
            while (maxNum>0){

                maxNum -= nums[res];
                res++;
                //System.out.println("maxNum" + maxNum);
            }
            if(maxNum<0){
                System.out.println(res-1);
            }else {
                System.out.println(res);
            }

        }

    }
}


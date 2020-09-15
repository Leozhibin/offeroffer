import java.util.*;
public class tecent {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];

        for(int i=0;i<num;i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for(int tmp : nums){
            System.out.println(tmp);
        }
    }
}

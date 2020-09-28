import java.util.*;
public class leetcode233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(partitionLabels(sc.nextLine()));
    }
//    ababbbasdsf
    public static List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i){
            last[S.charAt(i) - 'a'] = i;
        }
        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);//核心代码 贪心 我只要所有子串的最大区域
            if (i == j) {
                ans.add(i - anchor + 1);//各子串的长度
                anchor = i + 1;//下一个独立子串的起始
                System.out.println(anchor);
            }
        }
        return ans;
    }
}


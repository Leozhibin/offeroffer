import java.util.*;

import java.util.*;
public class tianyi1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(Puzzle(sc.next()));
        }
    }
    public static String Puzzle(String s) {
        int[] num=new int[26];
        for(int i=0;i<num.length;i++){
            num[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(num[s.charAt(i)-'a']<=min){//字符出现的次数
                min=num[s.charAt(i)-'a'];//寻找出现次数最小的字符们
            }
        }
        for(int i=0;i<s.length() && i>=0;){
            if(num[s.charAt(i)-'a']==min){
                if(i>0){
                    if(i<s.length()-1){
                        s=s.substring(0,i)+s.substring(i+1);//切掉中间某字符
                    }else{
                        s=s.substring(0,i);//最后一个字符的情况 切掉最后一个
                    }
                }else{
                    s=s.substring(i+1);//要切掉String的第一个字母
                }
            }else{
                i++;
            }
        }
        return s;
    }
}
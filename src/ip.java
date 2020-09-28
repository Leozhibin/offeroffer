import java.util.*;
public class ip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] addr;
        String res;
        if(str.split("\\.").length>1){
            addr = str.split("\\.",-1);
            if(addr.length==4){
                res = checkIpv4(addr);
            }else {
                res =  "Neither";
            }

        }else {
            addr = str.split(":",-1);// 这里一定要写-1  不然下面这个例子split之后就是8 应该为9才能过滤掉
//            2001:0db8:85a3:0:0:8A2E:0370:7334:
            if(addr.length!=8){
                res = "Neither";
            }else {
                res =  checkIpv6(addr);
            }
        }
        System.out.println(res);
    }

    public static  String checkIpv4(String[] str){
        for(String s:str){
            if(s.length()==0||s.length()>3)
                return "Neither";
            for(char c:s.toCharArray()){//必须是全数字
                if(!Character.isDigit(c)){
                    return "Neither";
                }
            }
            if(s.length()>1&&s.charAt(0)=='0')
            {
                return "Neither";//ipv4有前导零这个说法00是不可以的 ，ipv6没有 0000是可以的
            }else if(Integer.parseInt(s)>255)
            {
                return "Neither";
            }
        }
        return "IPv4";
    }

    public static  String checkIpv6(String[] str){
        String pat = "0123456789abcdefABCDEF";//这里大小写都得写
        for(String s:str){
            if(s.length()==0||s.length()>4){//ipv6定义每组1-4个字符 8组
                return "Neither";
            }
            for(char c:s.toCharArray()){
                if(pat.indexOf(c)==-1){
                    return "Neither";
                }
            }
        }
        return "IPv6";
    }

}

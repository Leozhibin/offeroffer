import java.util.*;
public class mi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        boolean isLetter = false;
        boolean isLetter1 = false;
        boolean isNum = false;
        boolean isSpecial  = false;

        for(String tmp : strs){
            if(tmp.length()<8||tmp.length()>120){
                System.out.println(1);
            }else {
                for(Character c:tmp.toCharArray()){
                    if(tmp.matches(".*[a-z]*.")){
                        isLetter1 = true;
                    }
                    if(tmp.matches(".*[A-Z]*.")){
                        isLetter = true;
                    }
                    if(Character.isDigit(c)){
                        isNum = true;
                    }
                    if(tmp.matches(".*[~!@#$%^&*{}_+|<>,.?/:;'\\[\\]{}\"]+.*")){
                        isSpecial = true;
                    }

                }
                if(isLetter&&isNum&&isSpecial&&isLetter1){
                    System.out.println("0");
                }
                else {
                    System.out.println("2");
                }
            }

            //System.out.println(tmp);
        }
    }
}

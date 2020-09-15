public class yy {
    public static void main(String[] args) {
        int num = 108;
        String str = String.valueOf(num);
        long count =shui(str);
        long res=0;

            if(count>num){
                res = count;
                while (res>num){
                    res = shui(String.valueOf((--num)));
                    System.out.println(res);
                }
                res = shui(String.valueOf((++num)));
            }
            else {
                while (res<num){
                    res = shui(String.valueOf((++num)));
                }
//                res = shui(String.valueOf((--num)));
            }
        System.out.println(Integer.MAX_VALUE);
//        for(long i=0;i<Long.MAX_VALUE;i++){
//            if(i==shui(String.valueOf(i))){
//                System.out.println(i);
//            }
//        }

    }

    public static long shui(String str){
        long result=0;
        for(int i=0;i<str.length();i++){
            String tmp = String.valueOf(str.charAt(i));
            result +=  (long) Math.pow(Integer.parseInt(tmp),str.length());
//            System.out.println((long) Math.pow(Integer.parseInt(tmp),str.length()));
        }
        return result;


    }

}

//        0
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        153
//        370
//        371
//        407
//        1634
//        8208
//        9474
//        54748
//        92727
//        93084
//        548834
//        1741725
//        4210818
//        9800817
//        9926315
//        24678050
//        24678051
//        88593477
//        146511208
//        472335975
//        534494836
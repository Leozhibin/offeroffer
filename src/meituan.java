import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
public class meituan {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int num = Integer.parseInt(input[2]);
//        int m = sc.nextInt();
//        int num = sc.nextInt();
        ArrayList<Set<Integer>> map = new ArrayList<Set<Integer>>();
        for(int z=0;z<n;z++){
            Set<Integer> zz = new HashSet<>();
            map.add(zz);
        }

        int[] lock = new int[m];
        Set<Integer> tuan= new HashSet<>();
        for(int i=0;i<num;i++){
//            System.out.println("i " + i);
            String strr = sc.nextLine();
//            System.out.println(strr);
            String[] str = strr.split(" ");
//            System.out.println(Arrays.toString( str));
            switch (str[0]){
                case "1":
                    int x = Integer.parseInt(str[1]);
                    int y = Integer.parseInt(str[2]);
                    if(tuan.contains(x))
                        continue;
                    Boolean hasBook = false;
                    int xLine = -1;
                    for(int j=0;j<map.size();j++){
                        if(map.get(j).contains(x)){
                            xLine = j;
                            if(lock[j]==1){
                                hasBook = true;
                                continue;
                            }
                        }

                    }
                    if(hasBook)
                        continue;
                    if(lock[y]==1){
                        continue;
                    }
                    if(xLine!=-1){
                        map.get(xLine).remove(x);
                    }
                    map.get(y).add(x);
                    break;
                case "2":
                    int lockLine = Integer.parseInt(str[1]);
                    lock[lockLine] = 1;
                    break;
                case "3":
                    int unlockLine = Integer.parseInt(str[1]);
                    lock[unlockLine] = 0;
                    break;
                case  "4":
                    int borrow = Integer.parseInt(str[1]);
                    Boolean ifborrow = false;
                    for(int k=0;k<map.size();k++){
                        if(map.get(k).contains(borrow)&&lock[k]==0){
                            map.get(k).remove(borrow);
                            System.out.println(k);
                            ifborrow = true;
                            tuan.add(borrow);
                            break;
                        }
                    }
                    if(!ifborrow){
                        System.out.println("-1");
                    }
                    break;
                case "5":
                    int huan = Integer.parseInt(str[1]);
                    if(tuan.contains(huan)){
                        tuan.remove(huan);
                    }
                    break;
            }

        }

    }
}

/*

5 5 10
1 1 4
1 2 3
1 3 1
2 1
4 1
5 2
4 3
4 5
3 1
4 2

* */
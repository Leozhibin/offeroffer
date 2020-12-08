import java.util.*;

public class wenyuanzhixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] G =new  int[n];
        for(int i=0;i<n;i++){
            G[i]=sc.nextInt();
        }
        while (m>0){
            Arrays.sort(G);
            int max = G[G.length-1];
            int min = G[0];

            if(max-min>m){
                G[0] += m;
                m=0;
            }else{
                G[0] +=1;
                m -=(1);
            }
        }
        Arrays.sort(G);
        System.out.println(G[0]);
//        System.out.println(Arrays.toString(G));
    }
}

/*

4 5
2 1 3 5

4 6
2 1 3 5

4 4
2 2 2 2

* */
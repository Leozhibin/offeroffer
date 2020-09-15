public class huixing {
    public static void main(String[] args) {
//        int  matrix[][] = {{2,5},{8,4},{0,-1}};
        int  matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        [[2,5],[8,4],[0,-1]]

        int l=0,r=matrix[0].length-1 ,t = 0,b=matrix.length-1;
        int[] res = new int[(r+1)*(b+1)];
//        int[] res = new int[(r+1)*(b+1)];
        int x=0;
        while(true){
            for(int i=l;i<=r;i++) res[x++] = matrix[t][i];
            if(++t>b) break;// left 2 right
            for(int i=t;i<=b;i++) res[x++] = matrix[i][r];
            if(l>--r) break;// top 2 down
            for(int i=r;i>=l;i--) res[x++] = matrix[b][i];//right 2 left
            if(t>--b)break;
            for(int i=b;i>=t;i--) res[x++] = matrix[i][l];
            if(++l>r) break;
            System.out.println(res);
        }
        System.out.println(matrix);
        //return res;
//[1,2,3,6,9,8,7,4,5]

    }

}

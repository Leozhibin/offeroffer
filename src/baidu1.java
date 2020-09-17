import java.util.*;
/*
4
1 1 1 1
0 1 0 1
1 1 0 1
0 0 1 0

1 1 1 1
0 1 1 1
1 1 1 1
0 0 1 0

* */
public class baidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[][] go = new char[size][size];
        //循环独入矩阵
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                go[i][j] = sc.next().charAt(0);
            }
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                //如果是边缘的话那么开始dfs
                Boolean edge = false;
                if(i==0||i==size-1||j==0||j==size-1){
                    edge=true;
                }
                if(edge&&go[i][j]=='0'){
                    dfs(go,i,j);
                }
            }
        }
        //最后修正 把#伪目标（通过边缘dfs深搜得到的）全返回原型，那些O是真正包围的
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(go[i][j]=='#'){
                    go[i][j]='0';
                }else if(go[i][j]=='0'){
                    go[i][j]='1';
                }
            }
        }
        //打印输出的矩阵
        for(char[] tmp1:go){
            StringBuilder sb = new StringBuilder();
            for(char tmp2:tmp1){
                sb.append(tmp2+" ");
            }
            System.out.println(sb.toString());
        }
    }
    //dfs搜寻上下左右的位置
    public static void dfs(char[][] go,int i,int j){
        if(i<0||j<0||i>=go.length||j>=go.length|| go[i][j]=='1'||go[i][j]=='#'){
            return;
        }
        go[i][j] = '#';
        dfs(go,i-1,j);
        dfs(go,i,j-1);
        dfs(go,i+1,j);
        dfs(go,i,j+1);
    }
}

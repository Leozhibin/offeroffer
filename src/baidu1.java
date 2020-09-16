import java.util.*;
/*
4
1 1 1 1
0 1 0 1
1 1 0 1
0 0 1 0

* */
public class baidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[][] go = new char[size][size];

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                go[i][j] = sc.next().charAt(0);
            }
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Boolean edge = false;
                if(i==0||i==size-1||j==0||j==size-1){
                    edge=true;
                }
                if(edge){
                    dfs(go,i,j);
                }
            }
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(go[i][j]=='#'){
                    go[i][j]='0';
                }else if(go[i][j]=='0'){
                    go[i][j]='1';
                }
            }
        }

        System.out.println("  ");
    }

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

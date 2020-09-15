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
        Stack<Pair> stack = new Stack<>();
        ArrayList[] list = new ArrayList[size];
        for(int i=0;i<size;i++){
            list[i] = new ArrayList<Integer>();
            for(int j=0;j<size;j++){

                list[i].add(sc.nextInt());
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(list[i].get(j).equals(0)){
                    System.out.println("True");
                    stack.push(new Pair(i,j));
                }
            }
        }
        System.out.println("  ");
    }

    public static class Pair{
        int x=0;
        int y=0;
        Pair(int x1,int y1){
            this.x = x1;
            this.y = y1;
        }
    }
}

import java.awt.*;
import java.util.*;
public class test {
    public static void main(String[] args) {
//        System.out.println("d dfs");
        Set<Integer> set = new HashSet<>();
        Queue<Integer> que = new LinkedList<>();
//        ((LinkedList<Integer>) que).push(2);
//        ((LinkedList<Integer>) que).push(3);
//        ((LinkedList<Integer>) que).push(5);
        set.add(2);
        set.add(3);
        set.add(5);

        Scanner sc = new Scanner(System.in);
        int No = sc.nextInt();

        for(int i = 0;i<set.size();i++){
            if(set.size()>1000){
                break;
            }
            Iterator<Integer> iterator = set.iterator();
//            Integer[] toArray = (Integer[]) set.toArray();

            while (iterator.hasNext()){
                System.out.println(iterator.next());
                int x = iterator.next()*10 + 2;
                int y = iterator.next()*10 + 3;
                int z = iterator.next()*10 + 5;
                set.add(x);
                set.add(y);
                set.add(z);
            }

            int count =1;
            for(int j=0;j<3;j++){
                if(count==j)
                    System.out.println(set);
            }



//            set.forEach(num->num*10+2);
//            System.out.println(que.peek());
//            que.poll();
        }


    }
}

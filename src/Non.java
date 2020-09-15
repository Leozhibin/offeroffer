import java.util.*;
public class Non {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int No = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        int count = 0;

        while(count!=No){
            Integer[] toArray = (Integer[]) set.toArray();

            for(int i =0; i<toArray.length; i++){
                set.add(toArray[i]*10 +2);
                set.add(toArray[i]*10 +3);
                set.add(toArray[i]*10 +5);
            }
            count++;
        }
        System.out.println(((TreeSet<Integer>) set).last().toString());
    }
}

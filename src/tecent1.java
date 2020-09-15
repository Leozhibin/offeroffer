    import java.util.*;
    public class tecent1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int[] list = new int[num];
            for(int i=0;i<num;i++){
                int per = sc.nextInt();
                list[i] = per;
            }
            int[] sortList = list.clone();
            Arrays.sort(sortList);
            int mid1 = sortList[sortList.length/2];
            int mid2 = sortList[sortList.length/2];
            for(int tmp:list){
                if(tmp<=){
                    System.out.println();
                }
                //ArrayList<Integer> list1 = new ArrayList<>(list);
                //list1.remove(i);
                //list.sort(Comparator.comparingInt(Integer::intValue));
                //System.out.println(list1.get(list1.size()/2));
            }
        }

    }

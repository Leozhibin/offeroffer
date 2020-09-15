import java.util.*;
public class nodeTest {
/*
6
6 5 4 3 2 1
5
6 5 3 2 1

7
7 6 5 4 3 2 1
5
6 5 3 2 1

* */
public static class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val=x;
    }
}
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            ListNode node1 =new ListNode(0);
            ListNode head1 = node1;
            ListNode node2 =new ListNode(0);
            ListNode head2 = node2;
            ArrayList<Integer> res = new ArrayList<>();
            int size1=0;
            int size2=0;
            for(int i=0;i<num1;i++){
                size1++;
                node1.val = sc.nextInt();
                node1.next = new ListNode(0);
                node1 = node1.next;
            }
            int num2 = sc.nextInt();
            for(int i=0;i<num2;i++){
                size2++;
                node2.val = sc.nextInt();
                node2.next = new ListNode(0);
                node2 = node2.next;
            }
            //System.out.println("");
            if(size1>=size2){
                ListNode fir = head1;
                ListNode sec = head2;
                while (fir.next!=null&&sec.next!=null){
                    if(fir.val==sec.val){
                        res.add(fir.val);
                        fir = fir.next;
                        sec = sec.next;
                    }else {
                        fir = fir.next;
                    }

                    //System.out.println();
                }
                StringBuilder sb = new StringBuilder();
                for(int tmp:res){
                    sb.append(tmp + " ");
//                    System.out.println(tmp);
                }
                System.out.println(sb.toString());
            }
        }





}

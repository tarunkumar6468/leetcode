
import java.util.Scanner;
 class ListNode1{
    int val;
    ListNode1 next;
    ListNode1(){}
    ListNode1( int x){
        val = x;
        next = null;
    }
}
class function {
    public ListNode1 mergeNodes(ListNode1 head){
        ListNode1 dummy = new ListNode1();
        ListNode1 current = dummy;

        int sum = 0;
        ListNode1 node = head.next;
        while(node != null){
            if(node.val == 0){
                current.next = new ListNode1(sum);
                current = current.next;
                sum  = 0;
            }
            else{
                sum+=node.val;
            }
            node = node.next;
        }
        return dummy.next;
    }
}
public class Days_39_Merge_Nodes_in_Between_Zeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  // Create the head of the linked list
        ListNode1 head = new ListNode1();
        ListNode1 current = head;
        for(int i = 0; i<n; i++) {
        int value = sc.nextInt();
        current.next = new ListNode1(value);
        current = current.next;
        }

        printList(head);

        function ans =  new function();

        // merge the node get the head
        ListNode1 mergeHead = ans.mergeNodes(head);

        System.out.print("merge List :");
        printList(mergeHead);

    }
    // helper method to print the linked list
    public static void printList(ListNode1 head){
        ListNode1 node = head;
        while(node != null){
            System.out.print(node.val+ " ");
            node = node.next;
        }
        System.out.println();
    }
}

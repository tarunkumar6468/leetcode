 class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Day3_Remove_Nth_node_from_the_list {
    public static void main(String[] args){
        //  main function is hidden
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode al = new ListNode(0);
        al.next = head;
        ListNode fast = al;
        ListNode slow = al;
        for(int i = 0; i<=n; i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return al.next;
    }
}

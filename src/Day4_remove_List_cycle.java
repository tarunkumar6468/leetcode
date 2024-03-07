class listNode {
    int val;
    listNode next;
      listNode(int x) {
          val = x;
          next = null;
      }
  }
public class Day4_remove_List_cycle {
    public boolean hasCycle(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }
        return false;
    }
}

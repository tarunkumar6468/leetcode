public class Day5_Longest_common_subString {
    public static void main(String[] args){
        //input hide
    }
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode f = head;
        ListNode s = head;
        while (f != null) {
            f = f.next;
            if (f != null) {
                f = f.next;
                s = s.next;
            }
        }
        return s;

    }
}


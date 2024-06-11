public class Days_27_Reverse_Linked_List_II {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.println("Original list:");
        printList(head);

        // Reverse the list between positions 2 and 4
        Days_27_Reverse_Linked_List_II solution = new Days_27_Reverse_Linked_List_II();
        ListNode result = solution.reverseBetween(head, 2, 4);

        // Print modified list
        System.out.println("Modified list:");
        printList(result);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        // Create a dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Move the pointer to the node before the left position
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Reverse the sublist from left to right
        ListNode current = prev.next;
        ListNode next = null;
        ListNode prev2 = null;

        for (int i = left; i <= right; i++) {
            next = current.next;
            current.next = prev2;
            prev2 = current;
            current = next;
        }

        // Connect the reversed sublist back to the list
        prev.next.next = current;
        prev.next = prev2;

        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

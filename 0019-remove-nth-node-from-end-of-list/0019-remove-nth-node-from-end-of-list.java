class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int pos = len - n + 1; // position to delete from start

        // deleting head
        if (pos == 1) {
            return head.next;
        }

        temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
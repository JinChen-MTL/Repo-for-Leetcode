class Solution {
    public ListNode reverseList(ListNode head) {
        int[] array1 = new int[5000];
        int count = 0;
        
        while (head != null) {
            array1[count] = head.val;
            head = head.next;
            count++;
        }
        
        ListNode newHead = new ListNode();
        ListNode current = newHead;
        
        for (int i = count - 1; i >= 0; i--) {
            current.next = new ListNode(array1[i]);
            current = current.next;
        }
        
        return newHead.next;
    }
}

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
//version 2 ,my version ,which is simplifed:
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
        return l2;
    }
    if (l2 == null) {
        return l1;
    }

    ListNode head;
    if (l1.val <= l2.val) {
        head = l1;
        l1 = l1.next;
    } else {
        head = l2;
        l2 = l2.next;
    }

    ListNode current = head;

    while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }

    if (l1 != null) {
        current.next = l1;
    } else {
        current.next = l2;
    }

    return head;
}

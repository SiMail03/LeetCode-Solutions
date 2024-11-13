

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode (0);
        temp.next = head;
        ListNode current = temp.next;

        while(current.next != null) {
            if(current.val == current.next.val) {
                int duplicate = current.next.val;
                while(current.next!= null && current.next.val == duplicate)
                    current.next = current.next.next;
            }
            else
                current = current.next;
        }
        return temp.next;
    }
}
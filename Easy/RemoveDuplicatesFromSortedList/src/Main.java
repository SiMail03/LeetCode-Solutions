public class Main {
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 2 -> 3 -> 3 -> 4
        ListNode head = new ListNode();


        // Instantiate Solution and remove duplicates
        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(head);

        // Print the resulting list
        printList(result);  // Expected output should be 1 -> 4
    }

    // Utility method to print the list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

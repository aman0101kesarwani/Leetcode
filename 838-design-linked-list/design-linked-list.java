class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode dummy; // dummy node
    private int size;

    public MyLinkedList() {
        dummy = new ListNode(0);
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode curr = dummy.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    // Add at head
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    // Add at tail
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    // Add at index
    public void addAtIndex(int index, int val) {

        if (index > size) return;
        if (index < 0) index = 0;

        ListNode prev = dummy;

        // move to node before index
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        ListNode node = new ListNode(val);

        node.next = prev.next;
        prev.next = node;

        size++;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        ListNode prev = dummy;

        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        size--;
    }
}
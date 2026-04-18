class MyLinkedList{
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }


    Node head;
    Node tail;
    int size;

    int get(int index){
        if(index < 0 || index >= size) return -1;

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp.val;
    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail==null){
            head = tail = temp;
        }
        else{
            tail.next=temp;
            tail=tail.next;
        }

        size++;
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }

        size++;
    }

    void addAtIndex(int index, int val){

        // invalid index
        if(index < 0 || index > size) return;

        // insert at head
        if(index==0){
            addAtHead(val);
            return;
        }

        // insert at tail
        if(index==size){
            addAtTail(val);
            return;
        }

        Node temp = new Node(val);
        Node t = head;

        // move to (index - 1) position : iterate a index
        for(int i=0; i<index-1; i++){    // should go to (index-1)
            t = t.next;
        }

        temp.next = t.next;
        t.next = temp;

        size++;
    }


    void deleteAtIndex(int index){

        // 🔹 invalid index or empty list
        if(index < 0 || index >= size) return;

        // 🔹 Case 1: delete head
        if(index == 0){
            head = head.next;

            // if list becomes empty
            if(head == null){
                tail = null;
            }

            size--;
            return;
        }

        // 🔹 Case 2: delete at middle or end
        Node prev = head;

        // move to (index - 1)
        for(int i = 0; i < index - 1; i++){
            prev = prev.next;
        }

        // 🔹 if deleting last node → update tail
        if(prev.next == tail){
            tail = prev;
        }

        // 🔹 delete node
        prev.next = prev.next.next;

        size--;
    }

}
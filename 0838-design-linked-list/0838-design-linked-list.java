class MyLinkedList {

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1; // out of index
        Node temp = head;
        int currentIndex = 0;
        while (currentIndex != index) {
            temp = temp.next;
            currentIndex++;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node newNode = new Node(val);
            Node temp = head;
            int currentIndex = 0;

            while (currentIndex < index) {
                temp = temp.next;
                currentIndex++;
            }

            Node prev = temp.prev;
            newNode.next = temp;
            newNode.prev = prev;
            prev.next = newNode;
            temp.prev = newNode;
            
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node current = head;
            int currentIndex = 0;

            while (currentIndex < index) {
                current = current.next;
                currentIndex++;
            }

            Node prev = current.prev;
            Node next = current.next;
            prev.next = next;
            if (next != null) {
                next.prev = prev;
            }
        }
        size--;
    }
}

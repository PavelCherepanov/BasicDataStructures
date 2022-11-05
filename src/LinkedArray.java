public class LinkedArray<E> implements Array<E> {
    private Node head;

    public LinkedArray() {
        head = null;
    }

    public class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void addFirst(E element) {
        Node firstNode = new Node(element);
        firstNode.next = head;
        head = firstNode;
    }


    @Override
    public void add(E element) {
        Node currentNode = head;

        if (head == null) {
            head = new Node(element);
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(element);
        }
    }

    public void removeIndexOf(E element) {
        if (head == null) {
            return;
        }

        if (head.data == element) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == element) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }

    }

    @Override
    public int indexOf(E element) {
        if (head == null) {
            return -1;
        }
        if (head.data == element) {
            return 0;
        }
        Node currentNode = head;
        int result = 0;
        while (currentNode.next.data == element) {
            result++;
            if (currentNode.next.data == element) {
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "LinkedArray{" +
                "head=" + head +
                '}';
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }


}

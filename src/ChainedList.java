public class ChainedList {

    private Node first;

    public ChainedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int info) {
        Node aux = new Node();
        aux.setInformation(info);
        aux.setNext(first);
        first = aux;
    }

    public void addLast(int info) {
        if (isEmpty() == true) {
            addFirst(info);
        } else {
            Node aux = first;

            while (aux != null && aux.getNext() != null) {
                aux = aux.getNext();
            }
            if (aux.getNext() == null) {
                Node node = new Node();
                node.setInformation(info);
                aux.setNext(node);
            }
        }
    }

    public void removeFirst() {
        if (isEmpty() == true) {
            return;
        } else {
            first = first.next;
            return;
        }
    }

    public void removeLast() {
        if (isEmpty() == true) {
            return;
        }
        Node current = first;
        Node last = null;
        while (current.next != null) {
            last = current;
            current = current.next;
        }
        last.next = null;
        return;
    }

    void remove(int key) {

        if (first.getInformation() == key) {
            removeFirst();
            return;
        }

        remove(null, first, key);
    }

    void remove(Node anterior, Node atual, int key) {
        if (key == atual.getInformation()) {
            anterior.next = atual.next;
            return;
        }

        remove(atual, atual.next, key);
    }

    public void show() {
        Node aux = first;
        while (aux != null) {
            System.out.print(aux.getInformation() + ", ");
            aux = aux.getNext();
        }
    }
}
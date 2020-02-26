package collections.listPractice;

import java.util.Collection;
import java.util.List;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (isEmpty()) {
            head = new Node(o, null);
            return true;
        }
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node(o, null));
        return true;
    }

    public boolean remove(Object o) {
        Node prevNode = null;
        Node curNode = head;

        while (!o.equals(curNode.getValue())) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        prevNode.setNext(curNode.getNext());
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

//    public Object remove(int index) {
//        return null;
//    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyLinkedList{");
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.getValue().toString()).append(',');
            node = node.getNext();
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
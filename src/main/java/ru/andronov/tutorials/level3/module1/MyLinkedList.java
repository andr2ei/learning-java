package ru.andronov.tutorials.level3.module1;


public class MyLinkedList {

    private LinkedListNode headNode;
    private LinkedListNode tailNode;
    private int size;

    public MyLinkedList() {
        headNode = null;
        tailNode = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        LinkedListNode current = headNode;
        while (current != null) {
            if (current.getValue() != null && current.getValue().equals(o)) {
                return true;
            }
            current = current.getRight();
        }
        return false;
    }

    public boolean add(Object o) {
        if (headNode == null) {
            headNode = new LinkedListNode(o, null, null);
        } else if (tailNode == null) {
            tailNode = new LinkedListNode(o, null, headNode);
            headNode.setRight(tailNode);
        } else {
            LinkedListNode newTailNode = new LinkedListNode(o, null, tailNode);
            tailNode.setRight(newTailNode);
            tailNode = newTailNode;
        }
        size++;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int i) {
        return null;
    }

    public Object set(int i, Object o) {
        return null;
    }

    public void add(int i, Object o) {

    }

    public Object remove(int i) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }
}

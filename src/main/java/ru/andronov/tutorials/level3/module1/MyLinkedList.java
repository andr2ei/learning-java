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
        LinkedListNode current = headNode;
        if (o.equals(current.getValue())) {
            headNode = headNode.getRight();
            size--;
            return true;
        }
        while(current.getRight() != null) {
            if (current.getValue().equals(o)) {
                LinkedListNode left = current.getLeft();
                LinkedListNode right = current.getRight();
                if (current == tailNode) {
                    tailNode.getLeft().setRight(null);
                } else {
                    right.setLeft(left);
                    left.setRight(right);
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        headNode = null;
        tailNode = null;
    }

    public Object get(int i) {
        if (i < 0 || i > size-1) throw new ArrayIndexOutOfBoundsException();
        if (headNode == null) return null;
        if (i == 0) return headNode.getValue();
        if (i == size - 1 && tailNode != null) return tailNode.getValue();
        LinkedListNode current = headNode.getRight();
        int j = 1;
        while (current != null) {
            if (j == i) return current.getValue();
            current = current.getRight();
            j++;
        }
        return null;
    }

    public Object set(int i, Object o) {
        if (i < 0 || i > size-1) throw new ArrayIndexOutOfBoundsException();
        return null;
    }

    public void add(int i, Object o) {
        if (i < 0 || i > size-1) throw new ArrayIndexOutOfBoundsException();

    }

    public Object remove(int i) {
        if (i < 0 || i > size-1) throw new ArrayIndexOutOfBoundsException();
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList { ");
        if (headNode != null) {
            sb.append(headNode.getValue());
            LinkedListNode currentNode = headNode.getRight();
            while (currentNode != null) {
                sb.append(currentNode.getValue());
                sb.append(" ");
                currentNode = currentNode.getRight();
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

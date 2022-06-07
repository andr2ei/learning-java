package ru.andronov.tutorials.level3.module1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LinkedListNode {
    private Object value;
    private LinkedListNode right;
    private LinkedListNode left;

    public Object getValue() {
        return this.value;
    }

    public LinkedListNode getRight() {
        return this.right;
    }

    public LinkedListNode getLeft() {
        return this.left;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setRight(LinkedListNode right) {
        this.right = right;
    }

    public void setLeft(LinkedListNode left) {
        this.left = left;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LinkedListNode)) return false;
        final LinkedListNode other = (LinkedListNode) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$value = this.getValue();
        final Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LinkedListNode;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $value = this.getValue();
        result = result * PRIME + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "LinkedListNode(value=" + this.getValue() + ", right=" + this.getRight() + ", left=" + this.getLeft() + ")";
    }
}

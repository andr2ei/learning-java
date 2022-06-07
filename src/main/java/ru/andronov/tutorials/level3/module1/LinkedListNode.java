package ru.andronov.tutorials.level3.module1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LinkedListNode {
    private Object value;
    private LinkedListNode right;
    private LinkedListNode left;
}

package ru.andronov.tutorials.level3.module1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LinkedListNode {
    private Object value;
    private LinkedListNode right;
    private LinkedListNode left;
}

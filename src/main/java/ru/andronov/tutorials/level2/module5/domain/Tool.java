package ru.andronov.tutorials.level2.module5.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tool {
    private final String name;
    private int price;
}

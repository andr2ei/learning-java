package ru.andronov.tutorials.level2.module5;

import ru.andronov.tutorials.level2.module5.domain.Tool;

import java.util.List;
import java.util.Optional;

public interface ToolService {

    Optional<Tool> findToolByName(String name);
    boolean addTool(Tool t);
    boolean removeTool(Tool t);
    void printTools();
}

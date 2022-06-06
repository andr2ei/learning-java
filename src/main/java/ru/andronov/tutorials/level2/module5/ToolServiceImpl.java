package ru.andronov.tutorials.level2.module5;

import lombok.AllArgsConstructor;
import ru.andronov.tutorials.level2.module5.domain.Tool;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ToolServiceImpl implements ToolService {

    private final List<Tool> tools;

    @Override
    public Optional<Tool> findToolByName(String name) {
        for (Tool t: tools) {
            if (t.getName().equals(name)) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean addTool(Tool t) {
        return tools.add(t);
    }

    @Override
    public boolean removeTool(Tool t) {
        return tools.remove(t);
    }

    @Override
    public void printTools() {
        for(Tool t: tools) {
            System.out.println(t);
        }
        System.out.println();
    }
}

package ru.andronov.tutorials.level2.module5;

import lombok.RequiredArgsConstructor;
import ru.andronov.tutorials.level2.module5.domain.Client;
import ru.andronov.tutorials.level2.module5.domain.Tool;

import java.util.Optional;
import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ToolService toolService;
    private final Client client;
    private final Scanner scanner;

    @Override
    public void buyTool() {
        System.out.println("Enter tool name");
        String toolName = scanner.next();
        Optional<Tool> optionalTool = toolService.findToolByName(toolName);
        if (optionalTool.isPresent()) {
            if (optionalTool.get().getPrice() < client.getMoney()) {
                client.setMoney(client.getMoney() - optionalTool.get().getPrice());
                toolService.removeTool(optionalTool.get());
                System.out.println("Tool " + optionalTool.get().getName() + " has been bought");
            } else {
                System.out.println("Not enough money");
            }
        } else {
            System.out.println("The tool does not exist");
        }
    }

    @Override
    public void returnTool() {
        System.out.println("Enter tool name to return");
        String toolName = scanner.next();
        System.out.println("Enter refund amount");
        int price = scanner.nextInt();
        Tool t = new Tool(toolName, price);
        client.setMoney(client.getMoney() + t.getPrice());
        toolService.addTool(t);
    }

    @Override
    public void lookAtTools() {
        toolService.printTools();
    }
}

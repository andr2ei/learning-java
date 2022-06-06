package ru.andronov.tutorials.level2.module5;

import lombok.AllArgsConstructor;
import ru.andronov.tutorials.level2.module5.domain.Client;
import ru.andronov.tutorials.level2.module5.domain.Tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class StoreServiceImpl implements StoreService {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        List<Tool> tools = new ArrayList<>(Arrays.asList(
                new Tool("Scissors", 10),
                new Tool("Hammer", 20),
                new Tool("Mop", 15)
        ));

        ToolService toolService = new ToolServiceImpl(tools);

        Client client = new Client("Andrei", 25);

        ClientService clientService = new ClientServiceImpl(toolService, client);

        System.out.println("Welcome to our store!");
        while (true) {
            System.out.println("Choose action: 1 - buy tool, 2 - return tool, 3 - show tools");
            int action = scanner.nextInt();
            if (action == 1) {
                clientService.buyTool();
            } else if (action == 2) {
                clientService.returnTool();
            } else if (action == 3) {
                clientService.lookAtTools();
            } else {
                System.out.println("see you latter!");
                System.exit(0);
            }
        }
    }
}

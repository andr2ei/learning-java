package ru.andronov.tutorials.level2.module5;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.andronov.tutorials.level2.module5.domain.Client;

import java.util.Scanner;

class ClientServiceImplTest {

    @Test
    void buyTool() {
    }

    @Test
    void returnTool() {
    }

    @Test
    void lookAtTools() {
        ToolService toolService = Mockito.mock(ToolService.class);
        Mockito.doNothing().when(toolService).printTools();
        Scanner scanner = new Scanner(System.in);
        Client client = new Client("Andrei", 10);

        ClientService clientService = new ClientServiceImpl(toolService, client, scanner);
        clientService.lookAtTools();

        Mockito.verify(toolService).printTools();
        Mockito.verifyNoMoreInteractions(toolService);
    }
}
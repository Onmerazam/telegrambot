package com.github.onmerazam.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.onmerazam.jrtb.command.CommandName.START;
import static com.github.onmerazam.jrtb.command.StartCommand.START_MESSAGE;

@DisplayName("Unit-level testing for HelpCommand")
public class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }

}

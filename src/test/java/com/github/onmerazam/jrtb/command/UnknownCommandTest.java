package com.github.onmerazam.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.onmerazam.jrtb.command.UnknownCommand.UNKNOWN_COMMAND;

@DisplayName("Unit-level testing for HelpCommand")
public class UnknownCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return "/ffffff";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_COMMAND;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }

}

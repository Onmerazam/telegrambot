package com.github.onmerazam.jrtb.command;

import org.junit.jupiter.api.DisplayName;

import static com.github.onmerazam.jrtb.command.CommandName.HELP;
import static com.github.onmerazam.jrtb.command.HelpCommand.HELP_COMMAND;

@DisplayName("Unit-level testing for HelpCommand")
public class HelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_COMMAND;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }

}

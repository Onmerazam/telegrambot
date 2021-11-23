package com.github.onmerazam.jrtb.command;

import com.github.onmerazam.jrtb.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;

import static com.github.onmerazam.jrtb.command.CommandName.*;

public class CommandContainer {

    private final ImmutableMap<String, command> commandMap;
    private final command unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService){

        commandMap = ImmutableMap.<String, command> builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        unknownCommand = new UnknownCommand(sendBotMessageService);
    }
    public command retrieveCommand(String commandIdentifier){
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}

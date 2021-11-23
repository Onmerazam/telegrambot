package com.github.onmerazam.jrtb.command;

import com.github.onmerazam.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UnknownCommand implements command{

    private final SendBotMessageService sendBotMessageService;

    private static final String UNKNOWN_COMMAND = "Неизвестная команда";

    public UnknownCommand (SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),UNKNOWN_COMMAND);
    }
}

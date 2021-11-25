package com.github.onmerazam.jrtb.command;

import com.github.onmerazam.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class NoCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String NO_COMMAND = "Команда не найдена";

    public NoCommand (SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),NO_COMMAND);
    }
}

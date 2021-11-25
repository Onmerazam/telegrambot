package com.github.onmerazam.jrtb.command;

import com.github.onmerazam.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет, я недобитое детище самоучки, надеюсь ему хватит сил доделать меня.";

    public StartCommand(SendBotMessageService sendBotMessageService){
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),START_MESSAGE);
    }
}

package com.github.onmerazam.jrtb.command;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface command {
    void execute (Update update);
}

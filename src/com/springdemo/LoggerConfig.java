package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerConfig {

    private String rootLoggerConfig;
    private String printedLoggerConfig;

    public void setRootLoggerConfig(String rootLoggerConfig) {
        this.rootLoggerConfig = rootLoggerConfig;
    }

    public void setPrintedLoggerConfig(String printedLoggerConfig) {
        this.printedLoggerConfig = printedLoggerConfig;
    }

    public void initLogger() {
        Level rootLevel = Level.parse(rootLoggerConfig);
        Level printLevel = Level.parse(printedLoggerConfig);

        Logger applicationLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
        Logger loggerParent = applicationLogger.getParent();

        loggerParent.setLevel(rootLevel);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        loggerParent.addHandler(consoleHandler);
    }
}

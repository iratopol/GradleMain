package com.it.pages;

import io.qameta.allure.Step;
import org.apache.log4j.LogManager;

public class AllureLogger extends BasePage {

    private static final org.apache.log4j.Logger logger = LogManager.getLogger(AllureLogger.class);

    @Step("{0}")
    public static void logToAllure(String log) {
        logger.info("Logged to allure: " + log);
    }


}
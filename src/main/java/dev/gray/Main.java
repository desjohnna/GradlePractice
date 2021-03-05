package dev.gray;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {


    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.trace("logging trace message");
        logger.debug("logging debug message");
        logger.info("logging info message");
        logger.warn("logging warn message");
        logger.error("logging error message");
        logger.fatal("logging fatal message");

    }



}

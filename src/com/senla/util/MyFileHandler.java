package com.senla.util;

import java.io.IOException;
import java.util.logging.*;

public class MyFileHandler extends FileHandler {

    MyFileHandler myFileHandler;
    private static Logger logger = Logger.getLogger(MyFileHandler.class.getName());


    public MyFileHandler(String pattern) throws IOException, SecurityException, NullPointerException {
        pattern = "C:/Users/user/IdeaProjects/Hotel/src/com/senla/logging/myLogger.txt";


    }


    public void writingInLog(){

        logger.setUseParentHandlers(false);
        logger.addHandler(myFileHandler);
        logger.setLevel(Level.ALL);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        myFileHandler.setFormatter(simpleFormatter);
        logger.log(Level.ALL, "Тут хз");
    }
}

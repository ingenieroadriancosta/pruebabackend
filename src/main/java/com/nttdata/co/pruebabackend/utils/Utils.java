package com.nttdata.co.pruebabackend.utils;

import java.util.logging.Logger;

public class Utils {
    static final Logger logger = Logger.getLogger(Utils.class.getName());
    
    public static void loggerInfo(String msg){
        logger.info(msg);
    }


    private Utils() {
    }

}

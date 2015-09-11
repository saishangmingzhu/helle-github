package com.zuohao;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by zuohao on 15/9/11.
 */
public class Log4jTest {
    static Logger logger=Logger.getLogger(Log4jTest.class);
    public static void main(String[] args){
        logger=Logger.getLogger(Log4jTest.class);
        PropertyConfigurator.configure("src/log4j.properties");
        logger.info("info");
        logger.error("error");
        logger.debug("debug");
        logger.warn("warn");
    }
}

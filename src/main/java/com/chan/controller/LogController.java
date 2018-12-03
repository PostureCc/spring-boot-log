package com.chan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class LogController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/log")
    public String log4j(){
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "log";
    }

}

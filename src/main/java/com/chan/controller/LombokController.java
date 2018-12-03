package com.chan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class LombokController {

    @ResponseBody
    @RequestMapping("test1")
    public String test1() {
        //借助于lombok插件可以不用创建log字段
        log.debug("test1-debug");
        log.info("test1-info");
        log.warn("test1-warn");
        log.error("test1-error");
        return "test1";
    }

    @ResponseBody
    @RequestMapping("test2")
    public String test2() {
        int i = 1 / 0;
        return "test2";
    }

}

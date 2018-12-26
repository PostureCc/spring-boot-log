package com.chan.controller;

import com.chan.annotation.Role;
import com.chan.annotation.RoleAnnotation;
import com.chan.dao.StudentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class LogController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentDao studentDao;

    @RoleAnnotation(value = Role.USER)
    @ResponseBody
    @RequestMapping("/user")
    public String user() {
        System.out.println("user...");
        return "user";
    }

    @RoleAnnotation(value = Role.ADMIN)
    @ResponseBody
    @RequestMapping("/admin")
    public String admin() {
        System.out.println("admin...");
        return "admin";
    }

    @ResponseBody
    @RequestMapping("/queryInfo")
    public String queryInfo() {
        List<Map<String, Object>> list = studentDao.queryInfo().subList(0, 10);
//        list.forEach(item -> System.out.println(item.toString()));
        return list.toString();
    }

    @ResponseBody
    @RequestMapping("/log")
    public String log4j() {
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "log";
    }

    @ResponseBody
    @RequestMapping("/index")
    public String index() {
        int i = 5 / 0;
        return "index";
    }

}

package com.br.creditcard.web.controller;

import com.br.creditcard.api.service.TestHandler;
import org.apache.thrift.TException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bairong on 2018/5/16.
 */
@Controller
@RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
public class ActivityController {

    @Resource
    private TestHandler.Iface testHandler;


    @RequestMapping("/checkActivity")
    @ResponseBody
    public Map<String, String> test(){

        Map<String, String> map = new HashMap<>();
        map.put("test", "test");
        System.out.println("fdsfdf");

        try {
            testHandler.testHandler(0, map);
        } catch (TException e) {
            e.printStackTrace();
        }
        return map;
    }
}

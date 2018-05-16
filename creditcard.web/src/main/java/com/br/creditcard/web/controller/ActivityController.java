package com.br.creditcard.web.controller;

import com.sun.javafx.collections.MappingChange;
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

    @RequestMapping("/checkActivity")
    @ResponseBody
    public Map<String, Object> test(){

        Map<String, Object> map = new HashMap<>();
        map.put("test", "test");
        map.put("date", new Date());
        System.out.println("fdsfdf");
        return map;
    }
}

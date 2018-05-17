package com.br.creditcard.web.controller;

import com.br.creditcard.api.dto.ApiDto;
import com.br.creditcard.api.service.TestHandler;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bairong on 2018/5/16.
 */
@Controller
@RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
public class ActivityController {

    private static Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Resource
    private TestHandler.Iface testHandler;


    @RequestMapping("/checkActivity")
    @ResponseBody
    public Map<String, String> test(){

        Map<String, String> map = new HashMap<>();
        map.put("test", "test");
        try {
            ApiDto dto = testHandler.testHandler(0, map);
            logger.info("result={}", dto.toString());
            logger.error("result={}", dto.toString());
        } catch (TException e) {
            e.printStackTrace();
        }
        return map;
    }
}

package com.br.creditcard.web.controller;

import com.br.creditcard.api.dto.ApiDto;
import com.br.creditcard.api.service.TestHandler;
import com.br.creditcard.common.po.User;
import com.br.creditcard.common.utils.GsonUtils;
import com.br.creditcard.common.utils.RespMsg;
import com.google.gson.reflect.TypeToken;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bairong on 2018/5/16.
 */
@Controller
@RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
public class ActivityController extends  BaseController{

    private static Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Resource
    private TestHandler.Iface testHandler;

//    @Resource
//    private RedisTemplate<String, String> redisTemplate;


    @RequestMapping("/checkActivity")
    @ResponseBody
    public RespMsg<ApiDto> test(){

        Map<String, String> map = new HashMap<>();
        map.put("test", "test");
        try {
            ApiDto dto = testHandler.testHandler(0, map);
            logger.info("result={}", dto.toString());
            logger.error("result={}", dto.toString());

            ;
//            List<User> persons =GsonUtils.getInstace().fromJson(dto.getData(), new TypeToken<List<User>>() {}.getType());
            return success("成功",dto);
        } catch (TException e) {
            e.printStackTrace();
        }
//        redisTemplate.opsForValue().set("testKey","redisValue");
//        String value = redisTemplate.opsForValue().get("testKey");
//        logger.info("redis value={}", value);
        return null;
    }
}

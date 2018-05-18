package com.br.creditcard.center.handler;

import com.br.creditcard.api.dto.ApiDto;
import com.br.creditcard.center.service.TestService;
import com.br.creditcard.center.utils.HandlerResult;
import com.br.creditcard.common.po.User;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by bairong on 2018/5/16.
 */
public class TestHandler implements com.br.creditcard.api.service.TestHandler.Iface {

    private static Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @Resource
    private TestService testService;

    @Override
    public ApiDto testHandler(int tid, Map<String, String> paramMap) throws TException {

        List<User> userList = testService.getAllUser();

        return HandlerResult.success("成功", userList);
    }
}

package com.br.creditcard.center.handler;

import com.br.creditcard.api.dto.ApiDto;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by bairong on 2018/5/16.
 */
public class TestHandler implements com.br.creditcard.api.service.TestHandler.Iface{

    private static Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @Override
    public ApiDto testHandler(int tid, Map<String, String> paramMap) throws TException {
        ApiDto dto = new ApiDto();
        dto.setCode(1);
        dto.setMessage("success");
        dto.setData("data");
        logger.info("data = {}", dto.toString());
        return dto;
    }
}

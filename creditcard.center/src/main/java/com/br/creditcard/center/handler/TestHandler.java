package com.br.creditcard.center.handler;

import com.br.creditcard.api.dto.ApiDto;
import org.apache.thrift.TException;

import java.util.Map;

/**
 * Created by bairong on 2018/5/16.
 */
public class TestHandler implements com.br.creditcard.api.service.TestHandler.Iface{


    @Override
    public ApiDto testHandler(int tid, Map<String, String> paramMap) throws TException {
        ApiDto dto = new ApiDto();
        dto.setCode(1);
        dto.setMessage("success");
        dto.setData("data");
        return dto;
    }
}

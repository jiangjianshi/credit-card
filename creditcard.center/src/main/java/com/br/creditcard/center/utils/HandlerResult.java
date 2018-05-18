package com.br.creditcard.center.utils;

import com.br.creditcard.api.dto.ApiDto;
import com.br.creditcard.common.constants.Consts;
import com.br.creditcard.common.utils.GsonUtils;


/**
 * Created by bairong on 2018/5/17.
 */
public class HandlerResult {

    /**
     * 成功
     *
     * @param msg
     * @return
     */
    public static ApiDto success(String msg) {
        return success(msg, null);
    }

    /**
     * 失败
     *
     * @param msg
     * @return
     */
    public static ApiDto fail(String msg) {
        return fail(msg, null);
    }

    /**
     * 成功
     *
     * @param msg
     * @param obj
     * @return
     */
    public static ApiDto success(String msg, Object obj) {
        ApiDto dto = new ApiDto();
        dto.setCode(Consts.STATUS_SUCCESS);
        dto.setMessage(msg);
        if (obj != null)
            dto.setData(GsonUtils.beanToJson(obj));
        return dto;
    }

    /**
     * 失败
     *
     * @param msg
     * @param obj
     * @return
     */
    public static ApiDto fail(String msg, Object obj) {
        ApiDto dto = new ApiDto();
        dto.setCode(Consts.STATUS_FAIL);
        dto.setMessage(msg);
        if (obj != null)
            dto.setData(GsonUtils.beanToJson(obj));
        return dto;
    }
}

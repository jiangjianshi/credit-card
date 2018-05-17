package com.br.creditcard.mapper;

import com.br.creditcard.common.po.User;

import java.util.List;

public interface ActivityMapper {

    List<User> selectByPage();
}

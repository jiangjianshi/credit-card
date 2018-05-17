package com.br.creditcard.center.service.impl;

import com.br.creditcard.center.service.TestService;
import com.br.creditcard.common.po.User;
import com.br.creditcard.mapper.ActivityMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by bairong on 2018/5/16.
 */
@Service
@Transactional
public class TestServiceImpl implements TestService{

    @Resource
    private ActivityMapper activityMapper;

    @Override
    public List<User> getAllUser() {

        PageHelper.startPage(1, 10);
        return  activityMapper.selectByPage();
    }
}

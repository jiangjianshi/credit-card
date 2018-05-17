package com.br.creditcard.center;

import com.br.creditcard.common.dto.TestDto;
import com.br.creditcard.common.po.User;
import com.br.creditcard.mapper.ActivityMapper;
import com.br.creditcard.pagehelper.PagedList;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by bairong on 2018/5/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/center-context.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class AbcTest {

    private static Logger logger = LoggerFactory.getLogger(AbcTest.class);

    @Resource
    private ActivityMapper activityMapper;

    @Test
    public void abcTest() throws Exception {



        PageHelper.startPage(1, 10);
        List<User> list =  activityMapper.selectByPage();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        PagedList<User> pagedList = PagedList.newMe(pageInfo);
        logger.info("log info {}", 111111);
        logger.error("log error");
        logger.warn("log warn");

        TestDto dto = new TestDto();
    }
}

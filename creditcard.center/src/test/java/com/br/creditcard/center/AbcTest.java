package com.br.creditcard.center;

import com.br.creditcard.mapper.ActivityDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bairong on 2018/5/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/center-context.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class AbcTest {

    @Resource
    private ActivityDao activityDao;

    @Test
    public void abcTest() throws Exception {

        Map<String, Object> map =  activityDao.selectById();
        System.out.println(map.toString());
        System.out.println("test");
    }
}

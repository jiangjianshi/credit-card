package com.br.creditcard.center;

import com.br.creditcard.common.dto.TestDto;
import com.br.creditcard.mapper.ActivityDao;
import com.br.creditcard.pagehelper.PagedList;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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

        PageHelper.startPage(1, 10);
        List<Map<String, Object>> list =  activityDao.selectById();
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
        PagedList<Map<String, Object>> pagedList = PagedList.newMe(pageInfo);

        System.out.println("test");

        TestDto dto = new TestDto();
    }
}

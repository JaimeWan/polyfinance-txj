package com.ptteng;

import com.ptteng.dao.BackendAccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PolyfinanceBusinessServiceApplication.class)
public class PolyfinanceBusinessServiceApplicationTests {

    @Resource
    private BackendAccountMapper backendAccountMapper;

    @Test
    public void contextLoads() {
        System.out.println(backendAccountMapper.selectByPrimaryKey(1L));
    }

}

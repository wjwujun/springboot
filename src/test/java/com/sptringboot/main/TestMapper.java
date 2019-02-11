package com.sptringboot.main;


import com.sptringboot.main.entity.TbUser;
import com.sptringboot.main.mapper.TbUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootApplicationMain.class)
@Transactional
@Rollback
public class TestMapper {
    /**
     * 注入数据查询接口
     * 如果注入的时候报红线，在mapper上表加上@Component(名字)
     */
    @Autowired
    private TbUserMapper tbUserMapper;


    /**
     * 测试查询集合
     */
    @Test
    public void testSelect() {
        List<TbUser> tbUsers = tbUserMapper.selectAll();
        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser.getUsername());
        }
    }
    /*
     * 测试插入数据
     */
    @Test
    public void testInsert() {
        // 构造一条测试数据
        TbUser tbUser = new TbUser();
        tbUser.setUsername("Lusifer");
        tbUser.setPwd("123456");
        tbUser.setPhone("15888888888");
        tbUser.setCreated(new Date());
        tbUser.setSalt("salt");
        // 插入数据
        tbUserMapper.insert(tbUser);
    }
}

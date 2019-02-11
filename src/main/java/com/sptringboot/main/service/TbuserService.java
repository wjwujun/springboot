package com.sptringboot.main.service;

import com.sptringboot.main.entity.TbUser;
import com.sptringboot.main.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbuserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    public void testSelect() {
        List<TbUser> tbUsers = tbUserMapper.selectAll();
        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser.getUsername());
        }
    }
}

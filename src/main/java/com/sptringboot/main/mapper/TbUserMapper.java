package com.sptringboot.main.mapper;

import com.sptringboot.main.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.MyMapper;
@Component
public interface TbUserMapper extends MyMapper<TbUser> {
}
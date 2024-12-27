package com.dl.mapper;

import com.dl.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User queryById(@Param("id") int id);
}

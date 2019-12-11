package com.hao.teamjob.dao;

import com.hao.teamjob.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {
    User selectUserByEmail(@Param("email") String email);
}

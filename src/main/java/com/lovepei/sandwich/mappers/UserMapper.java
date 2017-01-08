package com.lovepei.sandwich.mappers;

import com.lovepei.sandwich.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by cumt_ on 2017/1/7.
 */
@Mapper
public interface UserMapper {

    Integer login(@Param("userName") String userName, @Param("passWord") String passWord);

    User findByName(@Param("userName") String userName);
}

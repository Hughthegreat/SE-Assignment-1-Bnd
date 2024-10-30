package com.sosd.xky.demos.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sosd.xky.demos.web.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 86187
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-10-21 19:59:48
* @Entity generator.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





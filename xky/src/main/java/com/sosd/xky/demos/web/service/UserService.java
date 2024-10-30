package com.sosd.xky.demos.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sosd.xky.demos.web.domain.User;
import java.util.List;

/**
* @description 针对表【user】的数据库操作Service
* @createDate 2024-10-21 19:59:48
*/
public interface UserService extends IService<User> {

  List<User> getList();

  String addUser(User user);

  Boolean deleteUser(Integer ids);

  String updateUser(User user);
}

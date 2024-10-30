package com.sosd.xky.demos.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sosd.xky.demos.web.domain.User;
import com.sosd.xky.demos.web.mapper.UserMapper;
import com.sosd.xky.demos.web.service.UserService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-10-21 19:59:48
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

  @Override
  public List<User> getList() {
    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
    return list(queryWrapper);
  }

  @Override
  public String addUser(User user) {
    boolean exists = exists(new LambdaQueryWrapper<User>().eq(User::getNum, user.getNum()));
    if (exists) {
      return "用户已存在";
    }
    boolean save = save(user);
    if (save) {
      return "用户已添加";
    }
    return "系统错误";
  }

  @Override
  public Boolean deleteUser(Integer ids) {
    boolean b = removeById(ids);
    return b;
  }

  @Override
  public String updateUser(User user) {
    boolean exists = exists(new LambdaQueryWrapper<User>().eq(User::getNum, user.getNum()));
    if (!exists) {
      return "用户不存在";
    }
    boolean update = update(user, lambdaUpdate().eq(User::getId, user.getId()));
    if (update) {
      return "用户已更新";
    }
    return "系统错误";
  }
}





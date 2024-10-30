package com.sosd.xky.demos.web.controller;

import com.sosd.xky.demos.web.domain.User;
import com.sosd.xky.demos.web.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/getUserList")
    public List<User> getUserList() {
      List<User> userList =  userService.getList();
      return userList;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        String updated = userService.addUser(user);
        return updated;
    }

    @DeleteMapping("/deleteUser/{id}")
    public Boolean deleteUser(@PathVariable Integer id) {
      Boolean deleted = userService.deleteUser(id);
      return deleted;
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user) {
      String updated = userService.updateUser(user);
      return updated;
    }
}

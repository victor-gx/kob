package com.kob.backend.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kob.backend.mapper.UserMapper;
import com.kob.backend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/user/all/")
    public List<User> getAll() {
        return userMapper.selectList(null);
    }

    /**
     * 查询单个用户
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}/")
    public User getuser(@PathVariable int userId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", userId);
        return userMapper.selectOne(queryWrapper);

    }
    // 条件查询
//    public List<User> getUser(@PathVariable int userId) {
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.ge("id", 2).le("id", 3);
//        return userMapper.selectList(queryWrapper);
//    }

    /**
     * 添加某个用户
     * @param userId
     * @param username
     * @param password
     * @return
     */
    @GetMapping("/user/add/{userId}/{username}/{password}")
    public String addUser(@PathVariable int userId,
                          @PathVariable String username,
                          @PathVariable String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(password);
        User user = new User(userId, username, encodedPassword);
        userMapper.insert(user);
        return "Add user successfully";
    }

    /**
     * 删除某个用户
     * @param userId
     * @return
     */
    @GetMapping("/user/delete/{userId}")
    public String deleteUser(@PathVariable int userId) {
        userMapper.deleteById(userId);
        return "Delete user successfully";
    }
}

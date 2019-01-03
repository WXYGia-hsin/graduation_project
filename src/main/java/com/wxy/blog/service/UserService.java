package com.wxy.blog.service;

import com.wxy.blog.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务接口
 */

public interface UserService {
    /**
     * 保存,更新用户
     * @param user
     * @return
     */
    User saveOrupdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void removeUser(Long id);

    /**
     * 删除列表里的用户
     * @param users
     */
    void removeUsersInBatch(List<User> users);

    /**
     * 根据ID获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User>listUsers();

    /**
     * 根据用户名进行模糊分页查询
     * @param name
     * @param pageable
     * @return
     */
    Page<User> listUsersByNameLike(String name, Pageable pageable);
}

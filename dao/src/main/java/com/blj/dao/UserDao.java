package com.blj.dao;

import com.blj.pojo.User;

import java.util.List;

/**
 * Created by blj on 2018/3/12.
 */
public interface UserDao {

    List<User> queryAll();
}

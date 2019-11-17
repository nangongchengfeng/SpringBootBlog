package com.heian.service;

import com.heian.po.User;

/**
 * Created by 南宫乘风
 */
public interface UserService {

    User checkUser(String username, String password);
}

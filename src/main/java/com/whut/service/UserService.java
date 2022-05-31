package com.whut.service;

import com.whut.domain.User;

public interface UserService
{
    boolean insertUser(User user);
    User getByUsername(String username);

}

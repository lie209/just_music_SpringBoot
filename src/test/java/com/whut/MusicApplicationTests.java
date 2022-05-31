package com.whut;

import com.whut.dao.UserDao;
import com.whut.domain.User;
import com.whut.service.MusicService;
import com.whut.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MusicApplicationTests
{
    @Autowired
    UserService userService;
    @Autowired
    private UserDao userDao;

    @Autowired
    private MusicService musicService;
    @Test
    void testById()
    {
        System.out.println(musicService.getListById("1"));
//        System.out.println(userDaoById);
//        System.out.println(userDao.getByUsername("lie209"));
    }

}

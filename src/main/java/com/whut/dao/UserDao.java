package com.whut.dao;

import com.whut.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao
{
    @Insert("insert into user values (null,#{username},#{password})")
    public boolean insert(User user);

//    @Delete("delete from user where id=${id}")
//    public boolean deleteById(Integer id);

    @Select("select * from user where id=#{id}")
    public User getById(Integer id);

    @Select("select * from user where username=#{username}")
    public User getByUsername(String username);

    @Select("select * from user")
    public List<User> getAll();

    @Select("select id from user where username=#{username}")
    public String getIdByUserName(String username);
}

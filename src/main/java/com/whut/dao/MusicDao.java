package com.whut.dao;

import com.whut.domain.Music;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface MusicDao
{
    @Insert("insert into playlist values (#{id},#{musicName},#{musicId})")
    public void insertMusic(Music music);

    @Select("select * from playlist WHERE musicName=#{musicName} and id=#{id}")
    public Music getByMusicNameAndId(String musicName,String id);

    @Delete("DELETE FROM playlist WHERE musicName=#{musicName} and id=#{id}")
    public void deleteByNameAndId(String musicName,String id);

    @Select("select * from playlist where id=#{id}")
    public List<Music> getListById(String id);

    @Delete("delete from playlist where musicName=#{musicName} and id=#{id}")
    public int deleteMusic(Music music);
}

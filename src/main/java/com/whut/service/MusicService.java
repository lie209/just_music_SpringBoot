package com.whut.service;

import com.whut.dao.MusicDao;
import com.whut.domain.Music;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface MusicService
{
    public void insertMusic(Music music);


    public Music getByMusicNameAndId(String musicName,String id);

    public void deleteByNameAndId(String musicName,String id);


    public List<Music> getListById(String id);

    public int deleteMusic(Music music);
}

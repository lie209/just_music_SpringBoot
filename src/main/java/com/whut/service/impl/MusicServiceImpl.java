package com.whut.service.impl;

import com.whut.dao.MusicDao;
import com.whut.domain.Music;
import com.whut.service.MusicService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MusicServiceImpl implements MusicService
{
    @Autowired
    MusicDao musicDao;
    @Override
    public void insertMusic(Music music)
    {
        musicDao.insertMusic(music);
    }

    @Override
    public Music getByMusicNameAndId(String musicName, String id) {
        return musicDao.getByMusicNameAndId(musicName,id);
    }

    @Override
    public void deleteByNameAndId(String musicName, String id) {
        musicDao.deleteByNameAndId(musicName,id);
    }

    @Override
    public List<Music> getListById(String id) {
        List<Music> musics=musicDao.getListById(id);
        return musics;
    }

    @Override
    public int deleteMusic(Music music) {
        return musicDao.deleteMusic(music);
    }
}

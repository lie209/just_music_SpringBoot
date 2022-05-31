package com.whut.controller;


import com.whut.dao.MusicDao;
import com.whut.domain.Music;
import com.whut.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("musics")
public class MusicController
{
    @Autowired
    MusicService musicService;
    @GetMapping("/{id}")
    public List<Music> getMusicById(@PathVariable String id)
    {
        List<Music> musicList=musicService.getListById(id);
        return musicList;
    }
    @PutMapping("/likeMusic")
    public List<Music> insertMusic(@RequestBody Music music)
    {
        musicService.insertMusic(music);
        List<Music> musicList=musicService.getListById(music.getId());
        return musicList;
    }
    @PostMapping ("/dislikeMusic")
    public List<Music> deleteMusic(@RequestBody Music music)
    {
        System.out.println(music);
        musicService.deleteMusic(music);
        List<Music> musicList=musicService.getListById(music.getId());
        return musicList;
    }
    @PostMapping("ifLike")
    public boolean whetherLike(@RequestBody Music music)
    {
        Music music1=musicService.getByMusicNameAndId(music.getMusicName(),music.getId());
        if(music1==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

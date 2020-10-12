package com.auth.app.allbums.music.service.musicauht.service;


import com.auth.app.allbums.music.service.musicauht.dao.RegisterDao;
import com.auth.app.allbums.music.service.musicauht.model.GroupUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupUserService {

    @Autowired
    private RegisterDao dao;

    public List<GroupUser> findAll() throws EmptyResultDataAccessException {
        return dao.findAll();
    }
}

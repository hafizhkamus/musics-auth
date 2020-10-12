package com.auth.app.allbums.music.service.musicauht.controller;

import com.auth.app.allbums.music.service.musicauht.dao.UserAdminDao;
import com.auth.app.allbums.music.service.musicauht.dto.UserAdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/api/user")
public class UserAdminController {

    @Autowired
    private UserAdminDao dao;

//    @GetMapping(path = "/list")
//    public ResponseEntity<List<UserAdmin>> findAll(){
//        return ResponseEntity.ok().body(dao.getAllUser());
//    }

    @GetMapping(path = "/username")
    public ResponseEntity<List<UserAdminDto.Username>> findUserName(){
        return ResponseEntity.ok().body(dao.getUserName());
    }

    @GetMapping(path = "/userpassword")
    public ResponseEntity<List<UserAdminDto.Password>> findPassword(){
        return ResponseEntity.ok().body(dao.getPassword());
    }

}

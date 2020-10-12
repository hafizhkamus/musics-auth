package com.auth.app.allbums.music.service.musicauht.controller;


import com.auth.app.allbums.music.service.musicauht.model.AkunAdmin;
import com.auth.app.allbums.music.service.musicauht.model.GroupUser;
import com.auth.app.allbums.music.service.musicauht.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/api/user-info")
public class UserManagementController {

    @Autowired
    private GroupUserService service;


    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        try {
            List<GroupUser> groupUsers = service.findAll();
            return new ResponseEntity<>(groupUsers, HttpStatus.OK);

        } catch (EmptyResultDataAccessException e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/tambah-role")
    public ResponseEntity<Boolean> tambahRole(@RequestBody AkunAdmin akunAdmin){
        return ResponseEntity.ok().body(service.tambahRole(akunAdmin));
    }

}

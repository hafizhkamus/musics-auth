package com.auth.app.allbums.music.service.musicauht.controller;

import com.auth.app.allbums.music.service.musicauht.dto.AkunAdminDto;
import com.auth.app.allbums.music.service.musicauht.service.AkunAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping(path = "/api/register")
public class RegisterController {

    @Autowired
    private AkunAdminService service;

    @PostMapping(path = "/saveAdmin")
    public ResponseEntity<?> saveAdmin(@RequestBody AkunAdminDto.New newAkun){
        try{
            service.saveAdmin(newAkun);
            return new ResponseEntity<>(newAkun, HttpStatus.CREATED);
        } catch (SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "/saveUser")
    public ResponseEntity<?> saveUser(@RequestBody AkunAdminDto.New newAkun){
        try{
            service.saveUser(newAkun);
            return new ResponseEntity<>(newAkun, HttpStatus.CREATED);
        } catch (SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = "/saveUserPremium")
    public ResponseEntity<?> saveUserPremium(@RequestBody AkunAdminDto.New newAkun){
        try{
            service.saveUserPremium(newAkun);
            return new ResponseEntity<>(newAkun, HttpStatus.CREATED);
        } catch (SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

}

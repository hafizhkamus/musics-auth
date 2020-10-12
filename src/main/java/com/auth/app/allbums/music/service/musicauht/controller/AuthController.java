package com.auth.app.allbums.music.service.musicauht.controller;

import com.auth.app.allbums.music.service.musicauht.dao.UserAdminDao;
import com.auth.app.allbums.music.service.musicauht.model.AkunAdmin;
import com.auth.app.allbums.music.service.musicauht.model.StatusLogin;
import com.auth.app.allbums.music.service.musicauht.model.UserAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping(path = "/api/auth")
public class AuthController {

    @Autowired
    private UserAdminDao dao;


    @PostMapping("/login")
    public ResponseEntity<StatusLogin> login(@RequestBody UserAdmin userAdmin) throws Exception {
        StatusLogin statusLogin = new StatusLogin();
        if (userAdmin != null) {
            String username = userAdmin.getUserName();
            Optional<AkunAdmin> useradmindb = dao.getUserAdminById(username);
            if (useradmindb.isPresent() && Objects.equals(username, useradmindb.get().getUsername())) {
                String password = userAdmin.getUserPassword();
                if (Objects.equals(password,useradmindb.get().getKeyword())) {
                    String token = UUID.randomUUID().toString();
                    statusLogin.setIsValid(true);
                    statusLogin.setToken(token);
                    List<String> roles = dao.getRolesByUserName(userAdmin.getUserName());
                    statusLogin.setRole(roles);
                    Map<String, Object> paramlogin = new HashMap<>();
                    paramlogin.put("username", username);
                    paramlogin.put("token", token);
                    dao.insertUserLogin(paramlogin);
                } else {
                    statusLogin.setIsValid(false);
                    statusLogin.setToken(null);
                }
            }
        } else {
            statusLogin.setIsValid(false);
            statusLogin.setToken(null);
        }
        return ResponseEntity.ok().body(statusLogin);
    }

    @PostMapping(path = "/checking")
    public ResponseEntity<Boolean> cekLoginValid(@RequestBody UserAdmin userAdmin){
        return ResponseEntity.ok().body(dao.cekLoginValid(userAdmin));
    }
}

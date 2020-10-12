package com.auth.app.allbums.music.service.musicauht.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAdmin {

    private String userName;
    private String userPassword;
    private String tokenKey;
}

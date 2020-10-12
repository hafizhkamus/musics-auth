package com.auth.app.allbums.music.service.musicauht.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupUser {

    private String id;
    private String idUser;
    private Integer idGroup;
    private String username;
    private String roleName;

}

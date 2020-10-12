package com.auth.app.allbums.music.service.musicauht.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GroupUserDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NewRegister{

        private String id;
        private String idUser;
        private Integer idGruop;
        private String username;
        private String roleName;
    }
}

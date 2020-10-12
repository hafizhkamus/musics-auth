package com.auth.app.allbums.music.service.musicauht.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AkunAdminDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Information{
        private String username;
        private String keyword;
        private Integer groupId;
        private String roleName;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class New {

        private String id;
        private String username;
        private String keyword;

    }
}

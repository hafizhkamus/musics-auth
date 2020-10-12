package com.auth.app.allbums.music.service.musicauht.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusLogin {

    private Boolean isValid;
    private String token;
    private List<String> role;
}

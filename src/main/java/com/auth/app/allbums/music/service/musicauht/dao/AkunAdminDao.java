package com.auth.app.allbums.music.service.musicauht.dao;


import com.auth.app.allbums.music.service.musicauht.dto.AkunAdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class AkunAdminDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public int save(AkunAdminDto.New value) throws SQLException {
        String basequery = "insert into akun_admin (id, username, keyword)" +
                " values (:id,:username, :keyword)";

        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("id", value.getId());
        parameterSource.addValue("username", value.getUsername());
        parameterSource.addValue("keyword", value.getKeyword());

        return jdbcTemplate.update(basequery, parameterSource);
    }
}

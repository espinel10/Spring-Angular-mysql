package com.example.springangular;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    private JdbcTemplate jdbcTemplate;
    private final static PersonaService.PersonaRowMapper PERSONA_ROW_MAPPER = new PersonaService.PersonaRowMapper();

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Persona> getAllPersonas() {
        return this.jdbcTemplate.query("select * from personas",
                PersonaService.PERSONA_ROW_MAPPER);
    }

    private static class PersonaRowMapper implements RowMapper<Persona> {
        @Override
        public Persona mapRow(ResultSet resultSet, int line) throws SQLException {
            Persona persona = new Persona();
            persona.setId(resultSet.getInt("id"));
            persona.setName(resultSet.getString("name"));
            persona.setApellidos(resultSet.getString("apellidos"));

            return persona;
        }
    }

}

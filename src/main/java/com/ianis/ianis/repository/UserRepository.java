package com.ianis.ianis.repository;

import com.ianis.ianis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> getAllUser()
    {
        final String sql = "SELECT id, login, password, firstname, lastname, email, phone_nb FROM users";

        return jdbcTemplate.query(sql, (resultSet, i) -> {
            int id = Integer.parseInt(resultSet.getString("id"));
            String login = resultSet.getString("login");
            String password = resultSet.getString("password");
            String firstname = resultSet.getString("firstname");
            String lastname = resultSet.getString("lastname");
            String email = resultSet.getString("email");
            String phone_nb = resultSet.getString("phone_nb");
            return new User(id, login, password, firstname, lastname, email, phone_nb);
        });
    }
}

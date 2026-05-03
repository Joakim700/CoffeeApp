package com.example.coffeeapplication.repository.jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeRepository {

    private final JdbcTemplate jdbc;

    public CoffeeRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }



}

package com.pg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class OrderService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/save")
    public void save(){
        this.jdbcTemplate.update("insert into orders(username) values ('张三')");
    }
}

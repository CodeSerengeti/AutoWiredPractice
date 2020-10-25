package com.mytry.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Map;

@Component
public class MyDaoImpl implements MyDao {

    @Autowired
    DataSource d1;
    @Autowired
    DataSource d2;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void querryData() {
        System.out.println("d1==d2?:"+(d1==d2));
        String sql="SELECT order_status FROM t_order WHERE order_number='scu20200810'";
//        jdbcTemplate.query(sql,)
        Map<String, Object> map = jdbcTemplate.queryForMap(sql);
        System.out.println("map:"+map);
    }
}

package bao5_spring_jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

/**
 * @Title testimpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\4 0004 15:14
 */
@Service
public class Bookmethod {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public book get(int id)
    {
        String sql="select id,name,price from book where id=?";
        RowMapper<book> rowmap = new BeanPropertyRowMapper<>(book.class);
        book t=jdbcTemplate.queryForObject(sql,rowmap,id);
        return t;
    }

}

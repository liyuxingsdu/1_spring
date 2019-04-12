package bao5_spring_jdbcTemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;


/**
 * @Title Junit
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\4 0004 15:07
 */
public class Junit{

    ApplicationContext ctx=new ClassPathXmlApplicationContext("spring5.xml");
    JdbcTemplate jdbcTemplate= (JdbcTemplate) ctx.getBean("jdbctemplate");
    Bookmethod t=ctx.getBean(Bookmethod.class);

    @Test
    public void test1()
    {
        System.out.println(t.get(1001));
    }
    @Test
    public void test2()
    {
        String sql="select * from book";
        RowMapper row=new BeanPropertyRowMapper(book.class);
        List<book> list=jdbcTemplate.query(sql,row);
        System.out.println(list);
    }
    @Test
    public void test3()
    {
        String sql="insert into person(name,money,flag) values(?,?,?)";
        List<Object[]> list =new ArrayList<Object[]>();
        Object[] a=new Object[]{"ee",50,"1"};
        list.add(a);
        list.add(new Object[]{"dd",40,"1"});
        jdbcTemplate.batchUpdate(sql, (List<Object[]>) list);
    }
    @Test
    public void test4()
    {
        String sql="update person set money=? where name=?";
        jdbcTemplate.update(sql,100,"dd");
    }

}


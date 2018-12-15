package bao8_spring_mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

;


/**
 * @Title Junit
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\6 0006 9:57
 */
public class Junit {
   public SqlSessionFactory getsqlsessionfactory() throws IOException {
       String resource="mybatis.xml";
       InputStream inputStream =Resources.getResourceAsStream(resource);
       return new SqlSessionFactoryBuilder().build(inputStream);
   }

   @Test
    public  void test1() throws IOException {
       SqlSessionFactory sqlSessionFactory=getsqlsessionfactory();
       SqlSession sqlSession=sqlSessionFactory.openSession();
       try {
           book b=sqlSession.selectOne("get.getbook",1000);
           System.out.println(b);
       }finally {
           sqlSession.close();
       }
   }

//   cache
   @Test
    public void test2() throws IOException {
       SqlSessionFactory sqlSessionFactory=getsqlsessionfactory();
       SqlSession sqlSession=sqlSessionFactory.openSession();
       SqlSession sqlSession1=sqlSessionFactory.openSession();
       try {
          get g=sqlSession.getMapper(get.class);
          book b=g.getbook(1001);
          System.out.println(b);
           b=g.getbook(1001);
           System.out.println(b);
          sqlSession.close();
          g = sqlSession1.getMapper(get.class);
          b=g.getbook(1001);
          System.out.println(b);

//          person p=g.getperson("aa");
//          System.out.println(p);
       }finally {
           sqlSession1.close();
       }
    }
    @Test
    public void test3() throws IOException {
        SqlSessionFactory sessionFactory = getsqlsessionfactory();
        SqlSession sqlSession = sessionFactory.openSession();
        try {
            get g = sqlSession.getMapper(get.class);
            Map<String, Object> map = g.getbookbyname("%");
            System.out.println(map);
            List<person> list = g.getpersonbyname("%");
            for(person p:list)
            {
                System.out.println(p);
                System.out.println();
            }
            Map<String, Object> map1 = new HashMap<>();
            map1.put("table","book");
            map1.put("id",1000);
            book b = g.getmap(map1);
            System.out.println(b);
            b = g.getidname(1001,"c++");
            System.out.println(b);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void test4() throws IOException {
       SqlSessionFactory sqlSessionFactory=getsqlsessionfactory();
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        try {
            get mapper = sqlSession.getMapper(get.class);
            book b=new book(null,"math",16);
            mapper.addbook(b);
            System.out.println(b);
// 自动提交
//          sqlSession.commit();
        }finally {
            sqlSession.close();
        }

    }
    @Test
    public void test5() throws IOException {
        SqlSessionFactory sqlSessionFactory=getsqlsessionfactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            get mapper = sqlSession.getMapper(get.class);
            book b=new book(1006,"physics",18);
// 更新操作
//           System.out.println(mapper.update(b));
// 删除操作
            mapper.delete(1006);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

    }
}

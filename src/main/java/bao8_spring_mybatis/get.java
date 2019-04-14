package bao8_spring_mybatis;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface get {
    public book getbook(int id);
    public person getperson(String name);
    //定义主键
    @MapKey("name")
    public Map<String,Object> getbookbyname(String name);
    public List<person> getpersonbyname(String name);
    public book getmap(Map<String, Object> map);
    //定义参数别名
    public book getidname(@Param("id") int id, @Param("name") String name);
    public void addbook(book b);
    public boolean update(book b);
    public void delete(int id);
}

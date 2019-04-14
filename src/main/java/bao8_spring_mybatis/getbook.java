package bao8_spring_mybatis;


import java.util.List;

public interface getbook {
    public bumen getnames(String name);
    public book getid(int id);
    public person getname(String name);
    public person getstep(String name);
    public List<person> getlist(String bm);
    public person getif(String name);
    public List<book> getwhere(book b);
}

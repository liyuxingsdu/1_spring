package bao7_spring_buybooks;

public interface book {
    public int getprice(int id);
    public void updatekucun(int id);
    public void  updatemoney(String name, int price);
    public  String getname(int id);
}

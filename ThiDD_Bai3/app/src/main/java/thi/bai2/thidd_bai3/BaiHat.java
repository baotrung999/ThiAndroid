package thi.bai2.thidd_bai3;

public class BaiHat {
    private String name;
    private String hinh;

    public BaiHat(String name, String hinh){
        this.name = name;
        this.hinh = hinh;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getHinh(){
        return hinh;
    }

    public String toString(){
        return "Bài Hát này là: " + this.name;
    }
}

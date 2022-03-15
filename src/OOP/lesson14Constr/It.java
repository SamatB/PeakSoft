package OOP.lesson14Constr;

public class It {

    private String aty;
    private String turu;
    private int salmagy;
    private int yldamdygy;
    private int jashy;

    public It(String name, String turu, int age){
    this.aty = name;
    this.turu = turu;
    this.jashy = age;
    }

    public It () {

    }


    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public int getSalmagy() {
        return salmagy;
    }

    public void setSalmagy(int salmagy) {
        this.salmagy = salmagy;
    }

    public int getYldamdygy() {
        return yldamdygy;
    }

    public void setYldamdygy(int yldamdygy) {
        this.yldamdygy = yldamdygy;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        this.jashy = jashy;
    }
}


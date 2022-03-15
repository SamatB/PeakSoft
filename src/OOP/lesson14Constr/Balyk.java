package OOP.lesson14Constr;

public class Balyk {
    private String aty;
    private String turu;
    private int salmagy;
    private int jashy;
    public Balyk(String name, int age){
      aty = name;
      jashy = age;
    }
    public Balyk () {

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

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        this.jashy = jashy;
    }
}

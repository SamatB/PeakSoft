package OOP.lesson14Constr;

import java.security.PublicKey;
import java.util.PrimitiveIterator;

public class Myshyk {

    public Myshyk (String aty, int salmagy, String color) {
        this.aty = aty;
        this.salmagy = salmagy;
        tusu = color;
    }

    public Myshyk () {

    }

    private String aty;
    private String turu;
    private int salmagy;
    private String tusu;

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

    public String getTusu() {
        return tusu;
    }

    public void setTusu(String tusu) {
        this.tusu = tusu;
    }
}

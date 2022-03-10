package Practice;

public class Rectangle {
    private int uzun;
    private int tuurasy;

    void setUzun (int uzunu) {
        this.uzun = uzunu;
    }
    int getUzun () {
        return uzun;
    }
    void setTuurasy (int tuurasy) {
        this.tuurasy = tuurasy;
    }
    int getTuurasy () {
        return tuurasy;
    }
    int recArea () {
        return uzun * tuurasy;
    }
}

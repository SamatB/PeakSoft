package OOP.Exam;

public abstract class  Data {
    private int num1;
    private int num2;
    private char symbol;

    public Data (){

}

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }


    public abstract void calculate ();
}

package SomaSimples;

public class Soma {
    private int num1;
    private int num2;

    public Soma(int n1, int n2){
        this.num1=n1;
        this.num2=n2;
    }
    public void Somando(){
        if (num1==3 && num2==5){
            System.out.println(num1+num2);
        }else{
            System.out.println("O numero não é 8");
        }
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

}


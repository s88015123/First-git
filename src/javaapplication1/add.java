package javaapplication1;//宣告子類別繼承父類別

/**
 *
 * 建構方式
 */

 public class add extends oper{
    add(double A,double B){
        this.A=A;
        this.B=B;
    }
    @Override
    double caculate(){
        return (A+B);
    }//複寫父類別運算方式
}
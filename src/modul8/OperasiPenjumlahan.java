/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;

/**
 *
 * @author BintangDiLangit
 */
public class OperasiPenjumlahan extends OperasiBilanganAbs{
protected double a,b,c;

    public OperasiPenjumlahan(double a,double b) {
        setA(a);
        setB(b);
        a = 0;
        b = 0;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        a=0;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        b=0;
    }

    public double getC() {
        return c;
    }

    public void setC() {
        this.c = a+b;
    }
    
     public void tampil(){
        System.out.println("Operasi Penjumlahan : "+a +" + "+b+" = "+getC());
    }
}

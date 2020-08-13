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
public class OperasiPembagian extends OperasiBilanganAbs{
     protected double a,b,c;
    public OperasiPembagian(double a,double b) {
        setA(a);
        setB(b);
        a = 0;
        b = 0;
    }
    protected double getA() {
        return a;
    }

    protected void setA(double a) {
        this.a = a;
        a=0;
    }

    protected double getB() {
        return b;
    }

    protected void setB(double b) {
        this.b = b;
        b=0;
    }

    protected double getC() {
        return c;
    }

    protected void setC() {
        this.c = a/b;
    }
    
     protected void tampil(){
        System.out.println("Operasi Pengurangan : "+a +" / "+b+" = "+getC());
    }
}

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
public abstract class OperasiBilanganAbs {
    protected double a,b,c;
    protected abstract double getA();
    protected abstract  void setA(double a);
    protected abstract double getB();

    protected abstract void setB(double b);

    protected abstract double getC();

    protected abstract void setC();
    protected abstract void tampil();
}

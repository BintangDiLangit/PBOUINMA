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
public final class OperasiBilanganCetakAbs {
    private void cetakAll(OperasiBilanganAbs[] o, double a,double b){
        for (int i = 0; i < o.length; i++) {
            o[i].setA(a);
            o[i].setB(b);
            o[i].setC();
            
            o[i].tampil();
            System.out.println("========================================");
            
        }
    }
    public static void main(String[] args) {
        double a = 10.5;
        double b = 0.5;
        
        OperasiBilanganAbs[] o = 
        {
            new OperasiPenjumlahan(a,b),
            new OperasiPengurangan(a,b),
            new OperasiPerkalian(a,b),
            new OperasiPembagian(a,b)
        };
        OperasiBilanganCetakAbs obc = new OperasiBilanganCetakAbs();
        obc.cetakAll(o, a, b);
    }
}

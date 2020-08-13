/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;

/**
 *
 * @author BintangDiLangit
 */
public class OperasiBilanganCetak extends OperasiBilangan{
    private void cetakAll(OperasiBilangan[] o, double a,double b){
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
        
        OperasiBilangan[] o = 
        {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };
        OperasiBilanganCetak obc = new OperasiBilanganCetak();
        obc.cetakAll(o, a, b);
    }
}

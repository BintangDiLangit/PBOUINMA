/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author BintangDiLangit
 */
public class main {
    public static void main(String[] args) {
        method m = new method();
        int[][] data1={
            {1,2},{3,5},{6,7}
    };
        int[][] data2={
            {8,9},{10,11},{12,13}
    };
        m.setData1(data1);
        m.setData2(data2);
        
       
        m.cetak("Matrik 1: \n");
        m.cetak(data1);
        m.cetak("Matrik 2: \n");
        m.cetak(data2);
        
        m.cetak("Penjumlahan :\n");
        m.setDataJumlah(data1, data2);
        m.cetak(m.getDataJumlah());
        
        m.cetak("Pengurangan :\n");
        m.setDataKurang(data1, data2);
        m.cetak(m.getDataKurang());

        m.cetak("Perkalian :\n");
        m.setDataKali(m.getDataJumlah(), 0.5);
        m.cetak(m.getDataKali());

    }
}

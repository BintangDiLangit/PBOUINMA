/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_lat2;

/**
 *
 * @author BintangDiLangit
 */
public class main {

        public static void main(String[] args) {
        
            
            int data[]={2,5,3,5,9,5};
            method m =  new method(data);
            
            
            m.setDiubah(5);
            
            m.setPengubah(1);
            
            m.cetak("Sebelum : ",m.getData());
            m.ubah(m.getDiubah(),m.getPengubah());
            m.cetak("Sesudah : ",m.getData());
            
            
            m.setNilaiKali(0.5);
            m.setProsesKali(m.getNilaiKali());
            
            m.cetak("Perkalian : ", m.getProsesKali());
            
            
    }
}

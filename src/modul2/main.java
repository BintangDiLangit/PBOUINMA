/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author BintangDiLangit
 */
public class main {
    public static void main(String[] args) {
        method b = new method();
        
        b.setBarang("Bolpoint");
        b.setStok(10);
        b.setHar_satuan(2000);
        b.setTotal(b.getHar_per_brng());
        pr(b);
        
        b.setBarang("Pensil");
        b.setStok(10);
        b.setHar_satuan(1000);
        b.setTotal(b.getHar_per_brng());
        pr(b);
        
        b.setBarang("Penghapus");
        b.setStok(10);
        b.setHar_satuan(500);
        b.setTotal(b.getHar_per_brng());
        pr(b);
        
        
        tot(b);
        
        
        
    }
    public static void pr(method b){
        System.out.println("Nama Alat Tulis : "+b.getBarang());
        System.out.println("Stok : "+b.getStok());
        System.out.println("Harga Satuan : "+b.getHar_satuan());
        System.out.println("Harga "+b.getBarang() + " : "+b.getHar_per_brng());
        System.out.println("");
    }
    
    public static void tot(method b){
        System.out.println("Total Harga : "+ b.getTotal());
    }
    
}

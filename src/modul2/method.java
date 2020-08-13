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
public class method {


    private String barang;
    private int stok;
    private int har_satuan , har_per_brng , total;
    
    public method(){
        
    }
    
    public method(String x){
        
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHar_satuan() {
        return har_satuan;
    }

    public void setHar_satuan(int har_satuan) {
        this.har_satuan = har_satuan;
    }

    public int getHar_per_brng() {
        return har_per_brng = this.har_per_brng = har_satuan*stok;
    }

    public void setHar_per_brng(int har_per_brng) {
        this.har_per_brng = har_per_brng;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total += this.har_per_brng;
    }
    
    public void print(String x){
        System.out.println();
    }
    
    
}

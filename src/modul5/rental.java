/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BintangDiLangit
 */
public class rental extends VCDFilm {
    private String input;
    private int jumlahFIlm;
    
    BufferedReader tulis = new BufferedReader(new InputStreamReader(System.in));
    
    protected void cetak(String x){
        System.out.print(x);
    }

    protected int getJumlahFIlm() {
        return jumlahFIlm;
    }

    protected void setJumlahFIlm() throws IOException {
        this.cetak("Masukkan Jumlah FIlm : ");
        this.jumlahFIlm = Integer.parseInt(tulis.readLine());
    }
    
    
    protected void insertData(int jumlahFilm) throws IOException{
        for (int i = 1; i <= jumlahFilm; i++) {
            this.cetak("=========================");
            this.cetak("\nMasukkan Data Film ke- "+i);
            this.cetak("\nJudul : ");
            input = tulis.readLine();
            super.setJudul(input);
            
            this.cetak("Aktor : ");
            input = tulis.readLine();
            super.setAktor(input);
            
            this.cetak("Sutradara : ");
            input = tulis.readLine();
            super.setSutradara(input);
            
            this.cetak("Publisher : ");
            input = tulis.readLine();
            super.setPublisher(input);
            
            this.cetak("Kategori [SU : Semua Umur | D : Dewasa | R : Remaja | A : Anak-anak]: ");
            input = tulis.readLine();
            super.setKategori(input);
            
            this.cetak("Stok : ");
            input = tulis.readLine();
            super.setStok(input);
            
            
            this.cetak("\nData Film ke-"+i);
            this.display();
        }
    }
    
    protected void display(){
        this.cetak("\nJudul : "+super.getJudul());
        this.cetak("\nAktor : "+super.getAktor());
        this.cetak("\nSutradara : "+super.getSutradara());
        this.cetak("\nPublisher : "+super.getPublisher());
        this.cetak("\nKategori : "+super.getKategori());
        this.cetak("\nStok : "+super.getStok()+"\n");
    }
    
    
       
}

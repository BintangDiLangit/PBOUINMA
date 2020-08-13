/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author BintangDiLangit
 */
public class VCDFilm {
    private String Judul,Aktor,Sutradara,Publisher,Kategori,Stok;

    protected String getJudul() {
        return Judul;
    }

    protected void setJudul(String Judul) {
        this.Judul = Judul;
    }

    protected String getAktor() {
        return Aktor;
    }

    protected void setAktor(String Aktor) {
        this.Aktor = Aktor;
    }

    protected String getSutradara() {
        return Sutradara;
    }

    protected void setSutradara(String Sutradara) {
        this.Sutradara = Sutradara;
    }

    protected String getPublisher() {
        return Publisher;
    }

    protected void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    protected String getKategori() {
        return Kategori;
    }

    protected void setKategori(String Kategori) {
        if (Kategori.equals("SU")) {
            this.Kategori = "Semua Umur";
        }else if (Kategori.equals("D")) {
            this.Kategori = "Dewasa";
        }else if (Kategori.equals("R")) {
            this.Kategori = "Remaja";
        }else if (Kategori.equals("A")) {
            this.Kategori  = "Anak-anak";
        }else{
            this.Kategori = "Inputan Salah";
        }
    }

    protected String getStok() {
        return Stok;
    }

    protected void setStok(String Stok) {
        this.Stok = Stok;
    }
    
    
}

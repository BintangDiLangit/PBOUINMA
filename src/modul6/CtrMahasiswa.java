/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author BintangDiLangit
 */
public class CtrMahasiswa {

    private static String Univ;
    protected String NIM, Nama, Alamat, Jurusan;

    protected CtrMahasiswa() {

    }

    protected CtrMahasiswa(String Nim, String Nama, String Alamat, String Jurusan) {
        this.NIM = Nim;
        this.Nama = Nama;
        this.Alamat = Alamat;
        setJurusan(Jurusan);
    }

    public static String getUniv() {
        return Univ;
    }

    public static void setUniv(String Univ) {
        CtrMahasiswa.Univ = Univ;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getJurusan() {
        return this.Jurusan;
    }

    public void setJurusan(String Jurusan) {
        if (Jurusan.equals("61")) {
            this.Jurusan = "Matematika";
        } else if (Jurusan.equals("62")) {
            this.Jurusan = "Biologi";
        } else if (Jurusan.equals("63")) {
            this.Jurusan = "Kimia";
        } else if (Jurusan.equals("64")) {
            this.Jurusan = "Fisika";
        } else if (Jurusan.equals("65")) {
            this.Jurusan = "Teknik Informatika";
        } else if (Jurusan.equals("66")) {
            this.Jurusan = "Teknik Arsitektur";
        }
    }

    protected void cetak(String x) {
        System.out.println(x);
        x = null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

import javax.swing.JOptionPane;

/**
 *
 * @author BintangDiLangit
 */
public class CtrInsert extends CtrMahasiswa{
    protected CtrInsert(){
        
    }
    
    protected void insertData(){
        int i=1;
        
        CtrMahasiswa.setUniv(JOptionPane.showInputDialog("Masukkan Nama Univ : "));
        super.cetak("Data Mahasiswa "+CtrMahasiswa.getUniv());
        while (true) {            
            JOptionPane.showMessageDialog(null, "Masukkan Data Mhs ke-"+i);
            
            super.NIM =  JOptionPane.showInputDialog("Masukkan NIM : ");
            super.Nama =  JOptionPane.showInputDialog("Masukkan Nama : ");
            super.Alamat =  JOptionPane.showInputDialog("Masukkan Alamat : ");
            super.Jurusan =  JOptionPane.showInputDialog("Masukkan Jurusan : ");
            
            CtrMahasiswa mhs = new CtrMahasiswa(NIM, Nama, Alamat, Jurusan);
            mhs.cetak("\n Data ke-"+i);
            mhs.cetak("NIM Mahasiswa"+mhs.getNIM());
            mhs.cetak("Nama Mahasiswa : "+mhs.getNama());
            mhs.cetak("Alamat Mahasiswa : "+mhs.getAlamat());
            mhs.cetak("Jurusan Mahasiswa : "+mhs.getJurusan());
            
            String stop = JOptionPane.showInputDialog("Apakah Ingin Memasukkan Data Mahasiswa Lagi? (Y/T)");
            if (stop.equalsIgnoreCase("T")) {
                System.exit(0);
            }else if (stop.equalsIgnoreCase("Y")) {
                this.insertData();
            }else{
                JOptionPane.showMessageDialog(null, "Inputan Salah");
                System.exit(0);
            }
            
        i++;
        }
    }
            
}

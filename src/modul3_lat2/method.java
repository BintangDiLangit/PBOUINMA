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
public class method {
  

    private int[] data;
    private int diubah;
    private int pengubah;
    private double nilaiKali;
    private double[] data2=new double[6];

    public double getNilaiKali() {
        return nilaiKali;
    }

    public void setNilaiKali(double nilaiKali) {
        this.nilaiKali = nilaiKali;
    }
    
    public void setProsesKali(double nilaiKali){
        for (int i = 0; i < data.length; i++) {
            data2[i] = data[i]*nilaiKali;
        }
    }
    
    public double[] getProsesKali(){
        return data2;
    }
    
    
    public void cetak(String a,double[] data){
        System.out.print(a);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" | ");
        }
        System.out.println("");
    }

    
    public void cetak(String a,int[] data){
        System.out.print(a);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" | ");
        }
        System.out.println("");
    }

    public method(int[] data){
        this.data=data;
    }
    
    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getDiubah() {
        return diubah;
    }

    public void setDiubah(int diubah) {
        this.diubah = diubah;
    }

    public int getPengubah() {
        return pengubah;
    }

    public void setPengubah(int pengubah) {
        this.pengubah = pengubah;
    }
    
    public void ubah(int diubah,int pengubah){
        for (int i = 0; i < data.length; i++) {
            if (data[i]==diubah) {
                data[i]=pengubah;
            }
        }
    }
    
    
    
}

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
public class method {
    private int[][] data1;
    private int[][] data2;
    private int[][] dataJumlah;
    private int[][] dataKurang;

    public int[][] getDataKurang() {
        return dataKurang;
    }

    public void setDataKurang(int[][] data1,int[][] data2) {
          dataKurang = new int[data1.length][data2[0].length];
        for (int i = 0; i < dataKurang.length; i++) {
            for (int j = 0; j < dataKurang[i].length; j++) {
                dataKurang[i][j]=data1[i][j]-data2[i][j];
            }
        }
    }
    private double[][] dataKali;

    public int[][] getData1() {
        return data1;
    }

    public void setData1(int[][] data1) {
        this.data1 = data1;
    }

    public int[][] getData2() {
        return data2;
    }

    public void setData2(int[][] data2) {
        this.data2 = data2;
    }

    public int[][] getDataJumlah() {
        return dataJumlah;
    }

    public void setDataJumlah(int[][] data1,int[][] data2) {
           dataJumlah = new int[data1.length][data2[0].length];
        for (int i = 0; i < dataJumlah.length; i++) {
            for (int j = 0; j < dataJumlah[i].length; j++) {
                dataJumlah[i][j]=data1[i][j]+data2[i][j];
            }
        }
    }
    
    

    public double[][] getDataKali() {
        return dataKali;
    }

    public void setDataKali(int[][] data,double kali) {
         dataKali = new double[data.length][data[0].length];
          for (int i = 0; i < dataKali.length; i++) {
            for (int j = 0; j < dataKali[i].length; j++) {
                dataKali[i][j]=data[i][j]*kali;
            }
        }
    }
    
    
    public void cetak(String kata){
        System.out.print(kata);
    }
    
    public void cetak(int[][] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                cetak(data[i][j]+" ");
            }
            cetak("\n");
        }
    }
     public void cetak(double[][] data){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                cetak(data[i][j]+" ");
            }
            cetak("\n");
        }
    }
    
}

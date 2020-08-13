/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author BintangDiLangit
 */
public class method {

    private int data[];
    private int max,min;
    private double rata2;
    int cek[]=new int[99999];

    public method(int[] data){
        this.data=data;
    }
    
    public int[] getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }

    public int getMax() {
        return max;
    }

    public void setMax() {
        this.max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i]>max) {
                this.max = data[i];
            }
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin() {
        this.min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i]<min) {
                this.min = data[i];
            }
        }
    }

    public double getRata2() {
        return rata2;
    }

    public void setRata2() {
        double tampung = 0;
        for (int i = 0; i < data.length; i++) {
            tampung += data[i];
        }
        this.rata2 = tampung/data.length;
    }

    public int[] getCek() {
        return cek;
    }

    public void setCek(int cari) {
        int x;
        for (x = 0; x < data.length; x++) {
            if (data[x] == cari) {
                this.cek[x] = x;
            }
        }
    }
     public  void pr(String a){
        System.out.println(a);
    }
     
     public void cetakIn(int[] cari){
         for (int i = 0; i < data.length; i++) {
             if (cari[i] != 0) {
                 System.out.print(cari[i]);
                 System.out.print(" | ");
             }
             
         }
         System.out.println("");
     }
    
}

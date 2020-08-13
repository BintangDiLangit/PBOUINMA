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
public class main {
    public static void main(String[] args) {
        int data[]={-5 , -3 , -6 , -3 , 4};
        
        System.out.print("Data : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        
       method m = new method(data);
       
//       rata2
       m.setRata2();
       m.pr("Rata2 : "+m.getRata2());
       
//       max
      m.setMax();
      m.pr("Max : "+m.getMax());
      
//      min
      m.setMin();
      m.pr("Min : "+m.getMin());
//    index
     int cari = -3;
     m.setCek(cari);
     
        System.out.print("Data "+cari+" ada di index : ");
        m.cetakIn(m.getCek());
    
//    
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.io.IOException;

/**
 *
 * @author BintangDiLangit
 */
public class main extends rental{
    public static void main(String[] args) throws IOException {
        rental r = new rental();
        r.setJumlahFIlm();
        r.insertData(r.getJumlahFIlm());
        r.display();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_thu;

import java.util.Scanner;

public class Meo extends DongVat {

    String tiengKeu;

    public Meo() {
        super();
    }

    public Meo(String tiengKeu, String maDV, String tenDV, int canNang, String noiSong) {
        super(maDV, tenDV, canNang, noiSong);
        this.tiengKeu = tiengKeu;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.printf("|Tieng keu: %s\n", tiengKeu);
    }
}

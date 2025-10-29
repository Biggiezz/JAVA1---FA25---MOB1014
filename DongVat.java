/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thi_thu;

import java.util.Scanner;

public class DongVat {

    String maDV;
    String tenDV;
    int canNang;
    String noiSong;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDV, int canNang, String noiSong) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }

    public void inThongTin() {
        System.out.printf("Ma DV: %s| Ten DV: %s| Can nang: %d| Noi song: %s", maDV, tenDV, canNang, noiSong);
    }
}

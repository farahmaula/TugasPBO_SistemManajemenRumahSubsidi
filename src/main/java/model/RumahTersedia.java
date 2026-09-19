/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class RumahTersedia extends RumahSubsidi {
    private String lokasi;
    private int jumlahRumah;

    public RumahTersedia(String idRumah, String unit, String tipeRumah, double harga, String lokasi, int jumlahRumah) {
        super(idRumah, unit, tipeRumah, harga);
        setLokasi(lokasi);
        setJumlahRumah(jumlahRumah);
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public int getJumlahRumah() {
        return jumlahRumah;
    }
    
    public void setJumlahRumah(int jumlahRumah) {
        if (jumlahRumah > 0) {
            this.jumlahRumah = jumlahRumah;
        } else {
            System.out.println(">> Semua Unit Terjual!");
            this.jumlahRumah = 0;
        }
    }
    
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Lokasi     : " + lokasi);
        System.out.println("Jumlah Unit Rumah :" + jumlahRumah);
        System.out.println("Status     : Tersedia");
    }

}

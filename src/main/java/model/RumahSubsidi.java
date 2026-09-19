/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class RumahSubsidi {
    private final String idRumah;
    private String unit;
    private String tipeRumah;
    private double harga;

    public RumahSubsidi(String idRumah, String unit, String tipeRumah, double harga) {
        this.idRumah = idRumah;
        this.unit = unit;
        this.tipeRumah = tipeRumah;
        this.harga = harga;
    
    }

    public String getIdRumah() {
        return idRumah;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTipeRumah() {
        return tipeRumah;
    }

    public void setTipeRumah(String tipeRumah) {
        this.tipeRumah = tipeRumah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanData() {
        System.out.println("ID Rumah      : " + idRumah);
        System.out.println("Unit          : " + unit);
        System.out.println("Tipe Rumah    : " + tipeRumah);
        System.out.println("Harga         : Rp. " + harga);
    }
}

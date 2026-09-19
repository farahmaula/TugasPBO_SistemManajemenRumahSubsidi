/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class PengajuanPembelian {
    private String idPengajuan;
    private String nikPembeli;
    private String idRumah;
    private String metodePembayaran;
    private double jumlahBayar;

    public PengajuanPembelian(String idPengajuan, String nikPembeli, String idRumah) {
        this.idPengajuan = idPengajuan;
        this.nikPembeli = nikPembeli;
        this.idRumah = idRumah;
        this.metodePembayaran = "Belum Ada";
        this.jumlahBayar = 0;
    }

    public String getIdPengajuan() {
        return idPengajuan;
    }

    public void setIdPengajuan(String idPengajuan) {
        this.idPengajuan = idPengajuan;
    }

    public String getNikPembeli() {
        return nikPembeli;
    }

    public void setNikPembeli(String nikPembeli) {
        this.nikPembeli = nikPembeli;
    }

    public String getIdRumah() {
        return idRumah;
    }

    public void setIdRumah(String idRumah) {
        this.idRumah = idRumah;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public void tampilkanData() {
        System.out.println("ID Pengajuan       : " + idPengajuan);
        System.out.println("NIK Pembeli        : " + nikPembeli);
        System.out.println("ID Rumah           : " + idRumah);
        System.out.println("Metode Pembayaran  : " + metodePembayaran);
        System.out.println("Jumlah Bayar       : Rp. " + jumlahBayar);
    }
}

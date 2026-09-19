/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.util.ArrayList;
import java.util.Scanner;
import model.RumahSubsidi;
import model.RumahTersedia;
import model.PembeliRumahSubsidi;
import model.PengajuanPembelian;

/**
 *
 * @author ACER
 */
public class MenuRumahDanPembeli {
    Scanner input = new Scanner(System.in);
    ArrayList<RumahSubsidi> daftarRumah = new ArrayList<>();
    ArrayList<PembeliRumahSubsidi> daftarPembeli = new ArrayList<>();
    ArrayList<PengajuanPembelian> daftarPengajuan = new ArrayList<>();
    
        // MENU rumah
    
    public void menuRumahSubsidi() {
        int pilihan;

        do {
            System.out.println("\nMANAJEMEN DATA RUMAH");
            System.out.println("1. Tambah Rumah");
            System.out.println("2. Lihat Rumah");
            System.out.println("3. Ubah Rumah");
            System.out.println("4. Hapus Rumah");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahRumah();
                    break;

                case 2:
                    tampilRumah();
                    break;

                case 3:
                    ubahRumah();
                    break;

                case 4:
                    hapusRumah();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);

    }

    public void tambahRumah() {
        System.out.print("ID Rumah: ");
        String id = input.nextLine();

        for (RumahSubsidi rumah : daftarRumah) {
            if (rumah.getIdRumah().equalsIgnoreCase(id)) {
                System.out.println("ID Rumah sudah tersedia.");
                return;
            }
        }

        System.out.print("Unit: ");
        String unit = input.nextLine();
        System.out.print("Tipe Rumah: ");
        String tipe = input.nextLine();
        System.out.print("Harga: ");
        double harga = input.nextDouble();
        input.nextLine();

        if (harga <= 0) {
            System.out.println("Harga tidak valid.");
            return;
        }
        
        System.out.print("Lokasi: ");
        String lokasi = input.nextLine();

        System.out.print("Jumlah Rumah Tersedia: ");
        int jumlahRumah = input.nextInt();
        input.nextLine();

        if (jumlahRumah <= 0) {
            System.out.println("Jumlah rumah harus lebih dari 0.");
            return;
    }
        
        RumahTersedia rumahBaru = new RumahTersedia(id, unit, tipe, harga, lokasi, jumlahRumah);

        daftarRumah.add(rumahBaru);
        System.out.println("Rumah subsidi berhasil ditambahkan.");
    }

    public void tampilRumah() {
        System.out.println("\nDAFTAR RUMAH");
        if (daftarRumah.isEmpty()) {
            System.out.println("Data rumah masih kosong.");
            return;
        }

        for (RumahSubsidi rumah : daftarRumah) {
            System.out.println("\n==== Rumah Subsidi ====");            
            rumah.tampilkanData();
            System.out.println("=========================");
        }
    }

    public void ubahRumah() {
        System.out.print("Masukkan ID Rumah: ");
        String id = input.nextLine();

        for (RumahSubsidi rumah : daftarRumah) {
            if (rumah.getIdRumah().equalsIgnoreCase(id)) {
                System.out.print("Nomor Unit Baru: ");
                String unit = input.nextLine();
                System.out.print("Tipe Rumah Baru: ");
                String tipe = input.nextLine();
                System.out.print("Harga Baru: ");
                double harga = input.nextDouble();
                input.nextLine();

                if (harga <= 0) {
                    System.out.println("Harga tidak valid.");
                    return;
                }

                rumah.setUnit(unit);
                rumah.setTipeRumah(tipe);
                rumah.setHarga(harga);
                System.out.println("Data rumah berhasil diubah.");
                return;
            }
        }
        System.out.println("ID Rumah tidak ditemukan.");
    }

    public void hapusRumah() {
        System.out.print("Masukkan ID Rumah: ");
        String id = input.nextLine();

        for (int i = 0; i < daftarRumah.size(); i++) {
            if (daftarRumah.get(i).getIdRumah().equalsIgnoreCase(id)) {
                daftarRumah.remove(i);
                System.out.println("Data rumah berhasil dihapus.");
                return;
            }
        }
        System.out.println("ID Rumah tidak ditemukan.");
    }
    
    // MENU Pembeli

    public void menuPembeliRumahSubsidi() {
        int pilihan;

        do {
            System.out.println("\nMANAJEMEN DATA PEMBELI");
            System.out.println("1. Tambah Pembeli");
            System.out.println("2. Lihat Pembeli");
            System.out.println("3. Ubah Pembeli");
            System.out.println("4. Hapus Pembeli");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahPembeli();
                    break;

                case 2:
                    tampilPembeli();
                    break;

                case 3:
                    ubahPembeli();
                    break;

                case 4:
                    hapusPembeli();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);
    }

    public void tambahPembeli() {
        System.out.print("NIK: ");
        String nik = input.nextLine();

        for (PembeliRumahSubsidi pembeli : daftarPembeli) {
            if (pembeli.getNik().equals(nik)) {
                System.out.println("NIK sudah terdaftar.");
                return;
            }
        }

        if (nik.length() != 16) {
            System.out.println("NIK harus 16 digit.");
            return;
        }

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Penghasilan: ");
        double penghasilan = input.nextDouble();
        input.nextLine();
        System.out.print("No HP: ");
        String noHP = input.nextLine();
        System.out.println("Sudah memiliki rumah?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("Pilih: ");
        int pilihan = input.nextInt();
        input.nextLine();
        
        String statusPunyaRumah;
        
        if (pilihan == 1){
            statusPunyaRumah = "Ya";
        }
        else if (pilihan == 2) {
            statusPunyaRumah = "Tidak";
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
    }

        PembeliRumahSubsidi pembeliBaru = new PembeliRumahSubsidi(nik, nama, penghasilan, noHP, statusPunyaRumah);
        daftarPembeli.add(pembeliBaru);
        System.out.println("Pembeli berhasil ditambahkan.");
    }

    public void tampilPembeli() {
        System.out.println("\nDAFTAR PEMBELI");
        
        if (daftarPembeli.isEmpty()) {
            System.out.println("Data pembeli masih kosong.");
            return;
        }

        for (PembeliRumahSubsidi pembeli : daftarPembeli) {
            System.out.println("\n=========================");
            pembeli.tampilkanData();
            System.out.println("=========================");
        }
    }

    public void ubahPembeli() {
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        for (PembeliRumahSubsidi pembeli : daftarPembeli) {
            if (pembeli.getNik().equals(nik)) {
                System.out.print("Penghasilan Baru: ");
                double penghasilan = input.nextDouble();
                input.nextLine();
                System.out.print("No HP Baru: ");
                String noHP = input.nextLine();
                pembeli.setPenghasilan(penghasilan);
                pembeli.setNoHP(noHP);
                System.out.println("Data pembeli berhasil diubah.");
                return;
            }
        }
        System.out.println("NIK tidak ditemukan.");
    }
    
    public void hapusPembeli() {
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        for (int i = 0; i < daftarPembeli.size(); i++) {
            if (daftarPembeli.get(i).getNik().equals(nik)) {
                daftarPembeli.remove(i);
                System.out.println("Data pembeli berhasil dihapus.");
                return;
            }
        }
        System.out.println("NIK tidak ditemukan.");
    }

        //Menu Pengajuan

    public void menuPengajuanPembelian() {
        int pilihan;

        do {
            System.out.println("\nMANAJEMEN PENGAJUAN");
            System.out.println("1. Tambah Pengajuan");
            System.out.println("2. Lihat Pengajuan");
            System.out.println("3. Proses Pengajuan");
            System.out.println("4. Pembayaran");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan) {
                case 1:
                    tambahPengajuan();
                    break;

                case 2:
                    tampilPengajuan();
                    break;

                case 3:
                    prosesPengajuan();
                    break;

                case 4:
                    pembayaran();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);
    }

    public void tambahPengajuan() {
        System.out.print("ID Pengajuan: ");
        String idPengajuan = input.nextLine();

        for (PengajuanPembelian pengajuan : daftarPengajuan) {
            if (pengajuan.getIdPengajuan().equalsIgnoreCase(idPengajuan)) {
                System.out.println("ID Pengajuan sudah tersedia.");
                return;
            }
        }

        System.out.print("NIK Pembeli: ");
        String nik = input.nextLine();
        PembeliRumahSubsidi pembeliDipilih = null;

        for (PembeliRumahSubsidi pembeli : daftarPembeli) {
            if (pembeli.getNik().equals(nik)) {
                pembeliDipilih = pembeli;
                break;
            }
        }

        if (pembeliDipilih == null) {
            System.out.println("Pembeli tidak ditemukan.");
            return;
        }

        if (pembeliDipilih.getPenghasilan() < 2000000) {
            System.out.println("Pengajuan tidak dapat dibuat.");
            System.out.println("Penghasilan pembeli kurang dari Rp2.000.000.");
            System.out.println("Penghasilan belum memadai untuk mengajukan rumah subsidi.");
            return;
        }
        
        System.out.print("ID Rumah: ");
        String idRumah = input.nextLine();
        boolean rumahTersedia = false;

        for (RumahSubsidi rumah : daftarRumah) {
            if (rumah.getIdRumah().equalsIgnoreCase(idRumah)) {
                rumahTersedia = true;
                break;
            }
        }

        if (!rumahTersedia) {
            System.out.println("Rumah tidak ditemukan atau tidak tersedia.");
            return;
        }

        PengajuanPembelian pengajuanBaru = new PengajuanPembelian(idPengajuan, nik, idRumah);
        daftarPengajuan.add(pengajuanBaru);
        System.out.println("Pengajuan berhasil dibuat.");
    }

    public void tampilPengajuan() {
        if (daftarPengajuan.isEmpty()) {
            System.out.println("Data pembayaran masih kosong.");
            return;
        }

        for (PengajuanPembelian pembayaran : daftarPengajuan) {
            System.out.println("\n=========================");
            pembayaran.tampilkanData();
            System.out.println("=========================");
        }
    }

    public void prosesPengajuan() {
        System.out.print("Masukkan ID Pengajuan: ");
        String id = input.nextLine();

        for (PengajuanPembelian pengajuan : daftarPengajuan) {
            if (pengajuan.getIdPengajuan().equalsIgnoreCase(id)) {
                System.out.println("\nDATA PENGAJUAN");
                pengajuan.tampilkanData();
                System.out.print("\nApakah data pengajuan sudah sesuai? (y/t): ");
                String konfirmasi = input.nextLine();

                if (!konfirmasi.equalsIgnoreCase("y")) {
                    System.out.println("Proses pengajuan dibatalkan.");
                    return;
                }

                PembeliRumahSubsidi pembeliDipilih = null;

                for (PembeliRumahSubsidi pembeli : daftarPembeli) {
                    if (pembeli.getNik().equals(
                            pengajuan.getNikPembeli())){

                        pembeliDipilih = pembeli;
                        break;
                    }
                }

                if (pembeliDipilih == null) {
                    System.out.println("Data pembeli tidak ditemukan.");
                    return;
                }

                if (pembeliDipilih.getPenghasilan() < 2000000) {

                    System.out.println("Pengajuan DITOLAK.");
                    System.out.println(
                            "Penghasilan pembeli kurang dari Rp2.000.000.");
                    System.out.println(
                            "Penghasilan belum memadai untuk pengajuan.");
                    return;
                }

                if (pembeliDipilih.getStatusPunyaRumah()
                        .equalsIgnoreCase("Ya")) {

                    System.out.println(
                            "Pembeli sudah memiliki rumah.");
                    return;
                }

                System.out.println("\nPengajuan DISETUJUI.");
                System.out.println(
                        "Seluruh persyaratan telah terpenuhi.");
                return;
            }
        }
        System.out.println("ID Pengajuan tidak ditemukan.");
    }
    
    public void pembayaran() {
        System.out.print("Masukkan ID Pengajuan: ");
        String id = input.nextLine();

        for (PengajuanPembelian pengajuan : daftarPengajuan) {
            if (pengajuan.getIdPengajuan().equalsIgnoreCase(id)) {

                System.out.println("Metode Pembayaran:");
                System.out.println("1. Cash");
                System.out.println("2. Cicilan");
                System.out.print("Pilih: ");
                String pilihan = input.nextLine();

                if (pilihan.equals("1")) {
                    System.out.print("Jumlah Bayar: ");
                    double jumlah = input.nextDouble();
                    input.nextLine();

                    if (jumlah <= 0) {
                        System.out.println("Jumlah pembayaran tidak valid.");
                        return;
                    }

                    pengajuan.setMetodePembayaran("Cash");
                    pengajuan.setJumlahBayar(jumlah);
                    System.out.println("Pembayaran cash berhasil disimpan.");
                    return;
                }
                else if (pilihan.equals("2")) {
                    PembeliRumahSubsidi pembeliDipilih = null;

                    for (PembeliRumahSubsidi pembeli : daftarPembeli) {
                        if (pembeli.getNik().equals(pengajuan.getNikPembeli())) {
                            pembeliDipilih = pembeli;
                            break;
                        }
                    }

                    if (pembeliDipilih == null) {
                        System.out.println("Data pembeli tidak ditemukan.");
                        return;
                    }

                    double cicilan = pembeliDipilih.getPenghasilan() * 0.30;
                    pengajuan.setMetodePembayaran("Cicilan");
                    pengajuan.setJumlahBayar(cicilan);
                    System.out.println("\nPembayaran cicilan berhasil ditentukan.");
                    System.out.println("Penghasilan Pembeli : Rp. " + pembeliDipilih.getPenghasilan());
                    System.out.println("Persentase Cicilan  : 30%");
                    System.out.println("Cicilan Per Bulan   : Rp. " +  cicilan);
                    return;
                }
                else {
                    System.out.println("Pilihan metode pembayaran tidak valid.");
                    return;
                }
            }
        }
        System.out.println("ID Pengajuan tidak ditemukan.");
    }
}
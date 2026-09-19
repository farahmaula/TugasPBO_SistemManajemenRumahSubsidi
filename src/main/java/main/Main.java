/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import crud.MenuRumahDanPembeli;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenuRumahDanPembeli menu = new MenuRumahDanPembeli();
        int pilihan;

            do {
                System.out.println("\nSISTEM MANAJEMEN PENGELOLAAN RUMAH SUBSIDI");            
                System.out.println("1. Data Rumah Subsidi");
                System.out.println("2. Data Pembeli");
                System.out.println("3. Pengajuan Rumah Subsidi");
                System.out.println("0. Keluar");
                System.out.print("\nPilih menu: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        menu.menuRumahSubsidi();
                        break;

                    case 2:
                        menu.menuPembeliRumahSubsidi();
                        break;
                    
                    case 3:
                        menu.menuPengajuanPembelian();
                        break;

                    case 0:
                        System.out.println("Program selesai.");
                        break;

                    default:
                        System.out.println("Menu tidak tersedia.");
                }
            }
            while (pilihan != 0);
    }
    
}

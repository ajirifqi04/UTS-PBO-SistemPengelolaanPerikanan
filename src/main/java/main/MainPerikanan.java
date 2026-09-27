/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import java.util.ArrayList;
import model.Ikan;
import model.IkanLaut;
import model.IkanSungai;
import model.Stok;

/**
 *
 * @author AjiHowhow
 */
public class MainPerikanan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Ikan> daftarIkan = new ArrayList<>();
        ArrayList<Stok> daftarStok = new ArrayList<>();

        int pilihan = 0;

        while (pilihan != 6) {

            System.out.println("\n=================================");
            System.out.println(" SISTEM PENGELOLAAN PERIKANAN");
            System.out.println("=================================");
            System.out.println("1. Input Ikan Laut");
            System.out.println("2. Input Ikan Sungai");
            System.out.println("3. Tampilkan Data Ikan");
            System.out.println("4. Tampilkan Data Stok");
            System.out.println("5. Jumlah Data Ikan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.println("\n=== INPUT DATA IKAN LAUT ===");

                    System.out.print("ID Ikan: ");
                    String idIkanLaut = input.nextLine();

                    System.out.print("Nama Ikan: ");
                    String namaIkanLaut = input.nextLine();

                    System.out.print("Jenis Ikan: ");
                    String jenisIkanLaut = input.nextLine();

                    System.out.print("Status Konservasi: ");
                    String statusKonservasiLaut = input.nextLine();

                    System.out.print("Kedalaman Habitat: ");
                    String kedalamanHabitat = input.nextLine();

                    System.out.print("Wilayah Tangkap: ");
                    String wilayahTangkap = input.nextLine();

                    IkanLaut ikanLaut = new IkanLaut(
                            idIkanLaut,
                            namaIkanLaut,
                            jenisIkanLaut,
                            statusKonservasiLaut,
                            kedalamanHabitat,
                            wilayahTangkap
                    );

                    daftarIkan.add(ikanLaut);

                    System.out.println("\n=== INPUT DATA STOK ===");

                    System.out.print("ID Stok: ");
                    String idStokLaut = input.nextLine();

                    System.out.print("Jumlah Stok: ");
                    String jumlahStokLaut = input.nextLine();

                    System.out.print("Satuan: ");
                    String satuanLaut = input.nextLine();

                    Stok stokLaut = new Stok(
                            idStokLaut,
                            idIkanLaut,
                            jumlahStokLaut,
                            satuanLaut
                    );

                    daftarStok.add(stokLaut);

                    System.out.println("\nData ikan laut berhasil ditambahkan.");

                    break;

                case 2:

                    System.out.println("\n=== INPUT DATA IKAN SUNGAI ===");

                    System.out.print("ID Ikan: ");
                    String idIkanSungai = input.nextLine();

                    System.out.print("Nama Ikan: ");
                    String namaIkanSungai = input.nextLine();

                    System.out.print("Jenis Ikan: ");
                    String jenisIkanSungai = input.nextLine();

                    System.out.print("Status Konservasi: ");
                    String statusKonservasiSungai = input.nextLine();

                    System.out.print("Nama Sungai: ");
                    String namaSungai = input.nextLine();

                    System.out.print("Jenis Perairan: ");
                    String jenisPerairan = input.nextLine();

                    IkanSungai ikanSungai = new IkanSungai(
                            idIkanSungai,
                            namaIkanSungai,
                            jenisIkanSungai,
                            statusKonservasiSungai,
                            namaSungai,
                            jenisPerairan
                    );

                    daftarIkan.add(ikanSungai);

                    System.out.println("\n=== INPUT DATA STOK ===");

                    System.out.print("ID Stok: ");
                    String idStokSungai = input.nextLine();

                    System.out.print("Jumlah Stok: ");
                    String jumlahStokSungai = input.nextLine();

                    System.out.print("Satuan: ");
                    String satuanSungai = input.nextLine();

                    Stok stokSungai = new Stok(
                            idStokSungai,
                            idIkanSungai,
                            jumlahStokSungai,
                            satuanSungai
                    );

                    daftarStok.add(stokSungai);

                    System.out.println("\nData ikan sungai berhasil ditambahkan.");

                    break;

                case 3:

                    System.out.println("\n=== DATA IKAN ===");

                    if (daftarIkan.size() == 0) {
                        System.out.println("Belum ada data ikan.");
                    } else {

                        for (Ikan ikan : daftarIkan) {

                            ikan.tampilkanInfoIkan();

                            System.out.println("---------------------------------");
                        }
                    }

                    break;

                case 4:

                    System.out.println("\n=== DATA STOK ===");

                    if (daftarStok.size() == 0) {
                        System.out.println("Belum ada data stok.");
                    } else {

                        for (Stok stok : daftarStok) {

                            stok.tampilkanStok();

                            System.out.println("---------------------------------");
                        }
                    }

                    break;

                case 5:

                    System.out.println("\n=== JUMLAH DATA IKAN ===");
                    System.out.println("Jumlah data ikan : " + daftarIkan.size());

                    break;

                case 6:

                    System.out.println("\nProgram selesai.");

                    break;

                default:

                    System.out.println("\nPilihan menu tidak tersedia.");

                    break;
            }
        }

        input.close();
    }
}

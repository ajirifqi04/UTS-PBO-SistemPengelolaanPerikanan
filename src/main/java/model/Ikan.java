/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class Ikan {
    private String idIkan;
    private String namaIkan;
    private String jenisIkan;
    private String statusKonservasi;

    public Ikan(String idIkan, String namaIkan, String jenisIkan,
                String statusKonservasi) {

        this.idIkan = idIkan;
        this.namaIkan = namaIkan;
        this.jenisIkan = jenisIkan;
        this.statusKonservasi = statusKonservasi;
    }

    public String getIdIkan() {
        return idIkan;
    }

    public String getNamaIkan() {
        return namaIkan;
    }

    public String getJenisIkan() {
        return jenisIkan;
    }

    public String getStatusKonservasi() {
        return statusKonservasi;
    }

    public void setIdIkan(String idIkan) {
        this.idIkan = idIkan;
    }

    public void setNamaIkan(String namaIkan) {
        this.namaIkan = namaIkan;
    }

    public void setJenisIkan(String jenisIkan) {
        this.jenisIkan = jenisIkan;
    }

    public void setStatusKonservasi(String statusKonservasi) {
        this.statusKonservasi = statusKonservasi;
    }

    public void tampilkanInfoIkan() {
        System.out.println("ID Ikan           : " + idIkan);
        System.out.println("Nama Ikan         : " + namaIkan);
        System.out.println("Jenis Ikan        : " + jenisIkan);
        System.out.println("Status Konservasi : " + statusKonservasi);
    }
}

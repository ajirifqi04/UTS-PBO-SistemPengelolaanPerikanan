/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class IkanSungai extends Ikan{
    private String namaSungai;
    private String jenisPerairan;

    public IkanSungai(String idIkan, String namaIkan, String jenisIkan,
                      String statusKonservasi, String namaSungai,
                      String jenisPerairan) {

        super(idIkan, namaIkan, jenisIkan, statusKonservasi);
        this.namaSungai = namaSungai;
        this.jenisPerairan = jenisPerairan;
    }

    public String getNamaSungai() {
        return namaSungai;
    }

    public String getJenisPerairan() {
        return jenisPerairan;
    }

    public void setNamaSungai(String namaSungai) {
        this.namaSungai = namaSungai;
    }

    public void setJenisPerairan(String jenisPerairan) {
        this.jenisPerairan = jenisPerairan;
    }

    @Override
    public void tampilkanInfoIkan() {
        super.tampilkanInfoIkan();
        System.out.println("Nama Sungai       : " + namaSungai);
        System.out.println("Jenis Perairan    : " + jenisPerairan);
    }
}

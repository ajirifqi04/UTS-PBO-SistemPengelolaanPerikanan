/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class IkanLaut extends Ikan{
    private String kedalamanHabitat;
    private String wilayahTangkap;

    public IkanLaut(String idIkan, String namaIkan, String jenisIkan,
                    String statusKonservasi, String kedalamanHabitat,
                    String wilayahTangkap) {

        super(idIkan, namaIkan, jenisIkan, statusKonservasi);
        this.kedalamanHabitat = kedalamanHabitat;
        this.wilayahTangkap = wilayahTangkap;
    }

    public String getKedalamanHabitat() {
        return kedalamanHabitat;
    }

    public String getWilayahTangkap() {
        return wilayahTangkap;
    }

    public void setKedalamanHabitat(String kedalamanHabitat) {
        this.kedalamanHabitat = kedalamanHabitat;
    }

    public void setWilayahTangkap(String wilayahTangkap) {
        this.wilayahTangkap = wilayahTangkap;
    }

    @Override
    public void tampilkanInfoIkan() {
        super.tampilkanInfoIkan();
        System.out.println("Kedalaman Habitat : " + kedalamanHabitat);
        System.out.println("Wilayah Tangkap   : " + wilayahTangkap);
    }
}

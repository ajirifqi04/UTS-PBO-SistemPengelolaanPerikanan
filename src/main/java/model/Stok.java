/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AjiHowhow
 */
public class Stok {
    private String idStok;
    private String idIkan;
    private String jumlahStok;
    private String satuan;

    public Stok(String idStok, String idIkan, String jumlahStok,
                String satuan) {

        this.idStok = idStok;
        this.idIkan = idIkan;
        this.jumlahStok = jumlahStok;
        this.satuan = satuan;
    }

    public String getIdStok() {
        return idStok;
    }

    public String getIdIkan() {
        return idIkan;
    }

    public String getJumlahStok() {
        return jumlahStok;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setIdStok(String idStok) {
        this.idStok = idStok;
    }

    public void setIdIkan(String idIkan) {
        this.idIkan = idIkan;
    }

    public void setJumlahStok(String jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public void tampilkanStok() {
        System.out.println("ID Stok     : " + idStok);
        System.out.println("ID Ikan     : " + idIkan);
        System.out.println("Jumlah Stok : " + jumlahStok);
        System.out.println("Satuan      : " + satuan);
    }
}

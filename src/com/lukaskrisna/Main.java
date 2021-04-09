package com.lukaskrisna;


public class Main {

    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        //Persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 6;

        //Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 28;

        //Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 7;
        persegiPanjang.lebar = 3;

        //Segitiga
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 10;
        mSegitiga.tinggi = 12;
        mSegitiga.sisi = 6;


        //Panggil Method
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
}

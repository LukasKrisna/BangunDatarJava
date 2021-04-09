package com.lukaskrisna;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    float sisi;

    @Override
    float luas() {
        float luas = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    float keliling(){
        float keliling = alas + tinggi + sisi;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
}

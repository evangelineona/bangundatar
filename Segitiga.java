package com.mycompany.bangun_datar;


public class Segitiga extends Bangun_datar{
    float alas;
    float tinggi;
    
    float luas (){
        System.out.println("Menghitung luas segitiga");
        return (float) 0.5*alas*tinggi ;
    }
    float keliling (){
        System.out.println("Menghitung keliling segitiga");
        return 3*alas;
    }
    
}

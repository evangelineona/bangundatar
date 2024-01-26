
package com.mycompany.bangun_datar;

public class Lingkaran extends Bangun_datar{
        //jari jari lingkaran
    float r;
    float luas(){
       System.out.println("Menghitung luas lingkaran");
        return (float) Math.PI * r*r;
    }
        float keliling (){
        System.out.println("Menghitung laus persegi");
        return (float) Math.PI*r*2;  
    }
}

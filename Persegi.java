
package com.mycompany.bangun_datar;


public class Persegi extends Bangun_datar{
    
    float sisi;   
    
    float luas(){
     System.out.println("Menghitung laus persegi");
        return sisi*sisi;
    }
    
    float keliling(){
        System.out.println("Menghitung keliling bangun datar");
        return 4*sisi;
    }
}

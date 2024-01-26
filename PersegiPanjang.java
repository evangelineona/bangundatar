
package com.mycompany.bangun_datar;

    public class PersegiPanjang extends Bangun_datar {
    float panjang;
    float lebar;
    
    float luas(){
         System.out.println("Menghitung luas persegi panjang");
        return 2*panjang*lebar;
    } 
    float keliling (){
        System.out.println("Menghitung keliling persegi panjang");
        return 2+ panjang*lebar;
    }
}


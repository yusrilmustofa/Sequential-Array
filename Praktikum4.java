/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequantial.array;

import java.util.Scanner;

/**
 *
 * @author yusri
 */
public class Praktikum4 {
    public static void main(String[]args){
        Scanner I=new Scanner(System.in);
        String cari;
        System.out.println("Masukan data yang ingin dicari:");
        cari=I.nextLine();

        int a=0;
        for(int i=0;i<cari.length();i++){
            if(cari.charAt(i)=='a'){
                a++;
            }
        }System.out.println("Jumlah huruf a pada kalimat diatas adalah"+a);
    }
}

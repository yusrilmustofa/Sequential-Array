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
public class TugasPraktikum2 {
    public static void main(String[]args){
        double ratarata=0;
        int cari;
        int a=0;
        boolean found=false;
        int []data=new int[]{95,100,90,86,76,78,};
        Scanner I=new Scanner(System.in);
        
        System.out.println("Data Pada Array:");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]+ "/t");
            if(data[i]<a){
                a=data[i];
            }
        }for(int i=0;i<data.length;i++)ratarata+=data[i];
         ratarata/=data.length;
         System.out.println("\nRataRata nilai array="+ratarata);
         System.out.println("\nNilai yang diatas rataratanya adalah:");
         for(int j=0;j<data.length;j++){
             if(data[j]>ratarata){
                 System.out.println(data[j]+"t");
             }
         }
        }
    }


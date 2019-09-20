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
public class TugasPraktikum1 {
    public static void main(String[]args){
     int cari;
         int[]data=new int[]{71,71,71,71,75};
         System.out.println("Data Pada Array:");
         for(int i=0;i<data.length;i++){
             System.out.println(data[i]+"\t");
         }
       System.out.print("\n Masukan nilai yang akan anda cari:");
       Scanner I=new Scanner(System.in);
       cari=I.nextInt();
       int a=0;
       for(int i=0;i<data.length;i++){
           if(cari==data[i]){
               a++;
           }
       }System.out.println("Data yang ditemukan sebanyak"+a+"kali");
       if(a==0);
       System.out.println("Data tidak ditemukan");
}
}
    


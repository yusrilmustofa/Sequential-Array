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
public class Praktikum2 {
  public static void main(String[] args) {
  int cari;
  boolean found=false;
  int[]data=new int[]{8,90,23,54,23,76};
  Scanner I=new Scanner(System.in);
  System.out.println("Masukan Data yang ingin dicari");
  cari=I.nextInt();
  for(int i=0;i<data.length;i++){
      if(cari==data[i]){
          found=true;
          System.out.println("Data ditemukan pada indeks ke-"+i);
      }
  }if(found!=true){
    System.out.println("Data tidak ditemukan");
 } 
 }
}
    

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
public class SequantialArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cari;
        boolean Sistem=false;
        int[]data=new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner I=new Scanner(System.in);
        System.out.print("Berapa Nilai Yang Akan Anda Cari:");
        cari=I.nextInt();
        for(int i=0;i<data.length;i++){
            if(cari==data[i]){
            Sistem=true;
            break;   
        }
        }if(Sistem==true){
            System.out.println("Data Ditemukan");
        }else{
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
}

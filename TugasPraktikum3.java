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
public class TugasPraktikum3 {
    public static void main(String[]args){
        int[]data=new int[]{98,58,85,70,40,60};
        Scanner I=new Scanner(System.in);
        
        System.out.println("DATA ARRAY");
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]+"t");
            
        }
        System.out.println("\nNilai yang merupakan kelipatan 3:");
        for(int j=0;j<data.length;j++){
            if(data[j]%3==0){
                System.out.println(data[j]);
            }
        }
    }
}

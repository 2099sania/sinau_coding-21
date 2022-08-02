/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_sinaucoding;

/**
 *
 * @author user
 */

import java.util.Scanner;
public class persegi {
   public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int sisi, keliling, luas;
        
        System.out.println("Menghitung Luas & Keliling Persegi");
        System.out.print("Masukkan sisi : ");
        sisi = input.nextInt();
        System.out.println("");
        
        keliling = sisi + sisi + sisi + sisi;
        luas = sisi * sisi;
        
        System.out.println("Keliling Persegi = " +keliling);
        System.out.println("Luas Persegi = " +luas);
        
    }
}

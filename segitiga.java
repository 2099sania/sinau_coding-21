/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_sinaucoding;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class segitiga {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int alas, tinggi, keliling, luas;
        
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukkan alas : ");
        alas = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        tinggi = input.nextInt();
        System.out.println("");
        
        luas = ((alas * tinggi)/2);
        
        
        System.out.println("Luas Segitiga = " +luas);
        
    }
    
}

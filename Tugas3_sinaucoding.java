/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_sinaucoding;

/**
 *
 * @author user
 * 
 */
import java.util.Scanner;

public class Tugas3_sinaucoding {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int panjang, lebar, keliling, luas;
        
        System.out.println("Menghitung Luas & Keliling Persegi Panjang");
        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar : ");
        lebar = input.nextInt();
        System.out.println("");
        
        keliling = 2 * (panjang + lebar);
        luas = panjang * lebar;
        
        System.out.println("Keliling Persegi Panjang = " +keliling);
        System.out.println("Luas Persegi Panjang = " +luas);
        
    }
}
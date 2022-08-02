/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_sinaucoding;

/**
 *
 * @author user
 */
public class Tugas2_sinaucoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int akhir = 20;
        int bilangan;
        // TODO code application logic here
        for(int x = 1; x <= akhir ; x++){
            bilangan = 0;
            for (int y = 1; y <= x; y++){
                if ( x % y == 0){
                    bilangan++;
                }
            }
             if( bilangan == 2){
                 System.out.println(x + "Adalah Bilangan Prima");
            }else {
                 System.out.println(x + "Bukan Bilangan Prima");
             }
    }
    
   }
}
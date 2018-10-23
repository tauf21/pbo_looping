/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author github.com/tauf21
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        perulangan info = new perulangan();
       
        System.out.print("Masukan jumlah perulangan : ");
        info.setN(s.nextInt());
       
       //panggil perulangan while
        System.out.print("Perulangan While  \t: ");
        info.loopwhile();
       
       //panggil perulangan do while
        System.out.print("\n\nPerulangan Do While \t: ");
        info.loopdowhile();
       
       //panggil perulangan for
        System.out.print("\n\nPerulangan For      \t: ");
        info.loopfor();
       
    }
    
}

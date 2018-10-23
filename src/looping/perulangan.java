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
public class perulangan {
    private int i=1;
    private int j=1;
    private int k=1;
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
   
    public int loopwhile(){
    getN();
        while(i<=this.n){
            System.out.print(i+" ");
        i++;}
        return 0;
    }
    
    public int loopdowhile(){
    getN();
    do{System.out.print(j+" ");
    j++;
    }while(j<=this.n);
        return 0;
    }
    
    public int loopfor(){
    getN();
        for (k = 1; k <= this.n; k++) {
            System.out.print(k+" ");    
        }
        return 0;
    }

    
            
}


package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aleatorio {
    static public String x = "";
    public static void gera(){
    Random gera = new Random();
    
    
    int vet[] = new int[6];
    int i=0;
    for(i=0; i<6; i++){
        vet[i] = gera.nextInt(60);
        x = x + vet[i] + "  ";
    }
   
    JOptionPane.showMessageDialog(null,x );
    
}
    
}



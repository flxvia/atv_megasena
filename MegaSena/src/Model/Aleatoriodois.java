
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class Aleatoriodois {
    public static void main(String[] args){
    Random gera = new Random();
    String x = "";
    int vet[] = new int[15];
    int i=0;
    for(i=0; i<15; i++){
        vet[i] = gera.nextInt(25);
        x = x + vet[i] + "|";
    }
}
}

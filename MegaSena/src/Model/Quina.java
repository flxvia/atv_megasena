/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ETECIA
 */
public class Quina {
    public static void main(String[] args){
    Random gera = new Random();
    String x = "";
    int vet[] = new int[5];
    for(int i=0; i<5; i++){
        vet[i] = gera.nextInt(80);
        x = x + vet[i] + "|";
    }
    JOptionPane.showMessageDialog(null,x );
}
}

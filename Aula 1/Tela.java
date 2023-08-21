/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Semestre;
import javax.swing.JOptionPane;

/**
 *
 * @author alana
 */
public class Tela {
    public static void main(String[] args) {
        Semestre s = new Semestre();
        s.setNumero1(Double.valueOf(JOptionPane.showInputDialog("Digite nota 1: ")));
        s.setNumero2(Double.valueOf(JOptionPane.showInputDialog("Digite nota 2: ")));
        JOptionPane.showMessageDialog(null, "A media e "+s.media());
        
        if (s.media()>= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado");
 
        } else if (s.media() >= 4 && s.media() < 6) {
            JOptionPane.showMessageDialog(null, "Recuperacao");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}

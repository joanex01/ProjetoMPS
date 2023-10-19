/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author Marcus
 */
public class EasyGym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Criar uma instância da tela principal
        TelaPrincipal tela = new TelaPrincipal();

        // Criar um JFrame para exibir a tela principal
        JFrame frame = new JFrame("EasyGym App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(tela);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centralizar na tela
        frame.setVisible(true);
    }
}
    


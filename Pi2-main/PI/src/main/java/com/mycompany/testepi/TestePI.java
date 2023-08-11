/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.testepi;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class TestePI {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        TelaPrinci inicar = new TelaPrinci();
        inicar.setVisible(true);

        try {
            // Set Windows look and feel
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        inicar.setSize(800, 600);

        inicar.setExtendedState(JFrame.MAXIMIZED_BOTH);

        inicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inicar.setVisible(true);

    }

}

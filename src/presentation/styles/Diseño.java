/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClass;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.FocusManager;
import javax.swing.JTextField;

public class Diseño {

    String plomo = "#818181";
    String negro = "#000000";

    public void Mensaje(JTextField letra, String Mensaje, int tamaño) {
        if (tamaño == 0) {
            letra.setText(Mensaje);
            letra.setForeground(java.awt.Color.GRAY);
            letra.setFont(new Font("Sakkal Majalla", Font.ITALIC, 14));
        }
    }

    public void Clic(JTextField letra, String Mensaje) {
        if (letra.getText().equals(Mensaje)) {
            letra.setText(" ");
            letra.setForeground(java.awt.Color.gray);
            letra.setFont(new Font("Sakkal Majalla", Font.ITALIC, 14));
        }

    }
}

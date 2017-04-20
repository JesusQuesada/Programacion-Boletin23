/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author jquesadaabeijon
 */
public class IntGrafica extends JFrame {

    JPanel panel1, panel2, panel3;
    JLabel etiqueta1, etiqueta2;
    JTextArea areaTexto;
    JList lista;
    JButton boton1, boton2, boton3;
    String[] list;

    public void crearVentana() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        etiqueta1 = new JLabel("NOMBRE");
        etiqueta2 = new JLabel("PASSWORD");
        areaTexto = new JTextArea("Area de texto");
        list = new String[]{"ElementoLista1", "ElementoLista2", "ElementoLista3"};
        lista = new JList(list);
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        boton3 = new JButton("BOTON");
        this.setSize(700, 700);
        this.setVisible(true);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(panel2, BorderLayout.NORTH);
        panel1.add(panel3, BorderLayout.CENTER);
        this.add(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.add(etiqueta1);
        etiqueta1.setBounds(100, 50, 100, 100);
        panel2.add(etiqueta2);
        etiqueta2.setBounds(100, 100, 100, 100);
        panel2.add(boton1);
        boton1.setBounds(200, 200, 100, 50);
        panel2.add(boton2);
        boton2.setBounds(400, 200, 100, 50);
        panel2.setVisible(true);

        panel3.setLayout(null);
        panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel3.add(lista);
        lista.setBounds(30, 50, 200, 200);
        panel3.add(boton3);
        boton3.setBounds(300, 150, 100, 50);
        panel3.add(areaTexto);
        areaTexto.setBounds(500, 70, 150, 150);
        panel3.setVisible(true);

    }
}

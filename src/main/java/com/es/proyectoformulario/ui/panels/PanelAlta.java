package com.es.proyectoformulario.ui.panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class PanelAlta extends JPanel {
    JTextField idUser;
    JTextField  nombre;
    JTextField pass;
    JTextField pass2;
    JComboBox isadmin;

    JButton enviar;



    public PanelAlta(){
        this.setBackground(new Color(225, 139, 139));
        this.setLayout(null);

        JLabel idusuario =new JLabel("IdUsuario: ");
        idusuario.setLocation(new Point(200,150));
        idusuario.setSize(new Dimension(152,32));
        // usuario.setFont(new Font("Consolas", Font.BOLD, 22));
        this.add(idusuario);
        idUser = new JTextField("Introduzca su usuario: ");
        idUser.setLocation(new Point(260,150));
        idUser.setSize(new Dimension(152,32));
        this.add(idUser);

        JLabel nombres =new JLabel("Nombre: ");
        nombres.setLocation(new Point(200,200));
        nombres.setSize(new Dimension(152,32));
        this.add(nombres);
        nombre=new JTextField("introduce tu nombre: ");
        nombre.setLocation(new Point(260,200));
        nombre.setSize(new Dimension(152,32));
        this.add(nombre);

        JLabel passwd = new JLabel("Passwd: ");
        passwd.setLocation(new Point(200,250));
        passwd.setSize(new Dimension(152,32));
        this.add(passwd);

        pass = new JPasswordField();
        pass.setLocation(new Point(260,250));
        pass.setSize(new Dimension(152,32));
        this.add(pass);

        JLabel passwd2= new JLabel("Passwd2: ");
        passwd2.setLocation(new Point(200,300));
        passwd2.setSize(new Dimension(152,32));
        this.add(passwd2);

        pass2 =new JPasswordField();
        pass2.setLocation(new Point(260,300));
        pass2.setSize(new Dimension(152,32));
        this.add(pass2);

        JLabel Isadmin=new JLabel("IsAdmin: ");
        Isadmin.setLocation(new Point(200,350));
        Isadmin.setSize(new Dimension(152,32));
        this.add(Isadmin);

        isadmin=new JComboBox();
        isadmin.setLocation(new Point(260,350));
        isadmin.setSize(new Dimension(152,32));
        this.add(isadmin);


        enviar = new JButton("Enviar");
        enviar.setLocation(new Point(220,400));
        enviar.setSize(new Dimension(152,32));
        this.add(enviar);





    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import Controladores.ControladorAudio;
import Controladores.ControladorPartitura;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author jair
 */
public class NewJFrame extends javax.swing.JFrame {

    ControladorAudio ca;
    ControladorPartitura cp;
    JButton teclaPulsada;

    public NewJFrame() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.jpg")).getImage());
        cp = new ControladorPartitura();
        ca = new ControladorAudio(cp.obtenerPartitura());
        DarBordePanel(obtenerPanel(cp.obtenerIndiceCompas(),cp.obtenerIndiceTiempo()),true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new presentacion.ImagePanel();
        imagePanel2 = new presentacion.ImagePanel();
        pp1 = new presentacion.ImagePanel();
        pp2 = new presentacion.ImagePanel();
        pp3 = new presentacion.ImagePanel();
        pp4 = new presentacion.ImagePanel();
        pp5 = new presentacion.ImagePanel();
        pp6 = new presentacion.ImagePanel();
        pp7 = new presentacion.ImagePanel();
        pp8 = new presentacion.ImagePanel();
        pp9 = new presentacion.ImagePanel();
        pp10 = new presentacion.ImagePanel();
        pp11 = new presentacion.ImagePanel();
        pp12 = new presentacion.ImagePanel();
        pp13 = new presentacion.ImagePanel();
        pp14 = new presentacion.ImagePanel();
        pp15 = new presentacion.ImagePanel();
        pp16 = new presentacion.ImagePanel();
        pp17 = new presentacion.ImagePanel();
        pp18 = new presentacion.ImagePanel();
        pp19 = new presentacion.ImagePanel();
        pp20 = new presentacion.ImagePanel();
        pp21 = new presentacion.ImagePanel();
        pp22 = new presentacion.ImagePanel();
        pp23 = new presentacion.ImagePanel();
        pp25 = new presentacion.ImagePanel();
        pp24 = new presentacion.ImagePanel();
        pp26 = new presentacion.ImagePanel();
        pp28 = new presentacion.ImagePanel();
        pp27 = new presentacion.ImagePanel();
        pp29 = new presentacion.ImagePanel();
        pp30 = new presentacion.ImagePanel();
        pp31 = new presentacion.ImagePanel();
        pp32 = new presentacion.ImagePanel();
        pp33 = new presentacion.ImagePanel();
        pp34 = new presentacion.ImagePanel();
        pp35 = new presentacion.ImagePanel();
        pp36 = new presentacion.ImagePanel();
        pp37 = new presentacion.ImagePanel();
        pp38 = new presentacion.ImagePanel();
        pp39 = new presentacion.ImagePanel();
        pp40 = new presentacion.ImagePanel();
        pp41 = new presentacion.ImagePanel();
        pp42 = new presentacion.ImagePanel();
        pp43 = new presentacion.ImagePanel();
        pp44 = new presentacion.ImagePanel();
        pp45 = new presentacion.ImagePanel();
        pp46 = new presentacion.ImagePanel();
        pp47 = new presentacion.ImagePanel();
        pp48 = new presentacion.ImagePanel();
        jPanel2 = new javax.swing.JPanel();
        C4 = new javax.swing.JButton();
        D4b = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbFigura = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Partitura"); // NOI18N

        imagePanel1.setImagePath("/img/AppBackground.jpg");

        imagePanel2.setImagePath("/img/PartituraVacia.png");
        imagePanel2.setPreferredSize(new java.awt.Dimension(1000, 500));

        pp1.setImagePath("");
        pp1.setName(""); // NOI18N
        pp1.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp2.setImagePath("");
        pp2.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp3.setImagePath("");
        pp3.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp4.setImagePath("");
        pp4.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp5.setImagePath("");
        pp5.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp5Layout = new javax.swing.GroupLayout(pp5);
        pp5.setLayout(pp5Layout);
        pp5Layout.setHorizontalGroup(
            pp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp5Layout.setVerticalGroup(
            pp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp6.setImagePath("");
        pp6.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp6Layout = new javax.swing.GroupLayout(pp6);
        pp6.setLayout(pp6Layout);
        pp6Layout.setHorizontalGroup(
            pp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp6Layout.setVerticalGroup(
            pp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp7.setImagePath("");
        pp7.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp7Layout = new javax.swing.GroupLayout(pp7);
        pp7.setLayout(pp7Layout);
        pp7Layout.setHorizontalGroup(
            pp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp7Layout.setVerticalGroup(
            pp7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp8.setImagePath("");
        pp8.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp8Layout = new javax.swing.GroupLayout(pp8);
        pp8.setLayout(pp8Layout);
        pp8Layout.setHorizontalGroup(
            pp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp8Layout.setVerticalGroup(
            pp8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp9.setImagePath("");
        pp9.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp9Layout = new javax.swing.GroupLayout(pp9);
        pp9.setLayout(pp9Layout);
        pp9Layout.setHorizontalGroup(
            pp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp9Layout.setVerticalGroup(
            pp9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp10.setImagePath("");
        pp10.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp10Layout = new javax.swing.GroupLayout(pp10);
        pp10.setLayout(pp10Layout);
        pp10Layout.setHorizontalGroup(
            pp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp10Layout.setVerticalGroup(
            pp10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp11.setImagePath("");
        pp11.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp11Layout = new javax.swing.GroupLayout(pp11);
        pp11.setLayout(pp11Layout);
        pp11Layout.setHorizontalGroup(
            pp11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp11Layout.setVerticalGroup(
            pp11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp12.setImagePath("");
        pp12.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp12Layout = new javax.swing.GroupLayout(pp12);
        pp12.setLayout(pp12Layout);
        pp12Layout.setHorizontalGroup(
            pp12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp12Layout.setVerticalGroup(
            pp12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp13.setImagePath("");
        pp13.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp13Layout = new javax.swing.GroupLayout(pp13);
        pp13.setLayout(pp13Layout);
        pp13Layout.setHorizontalGroup(
            pp13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp13Layout.setVerticalGroup(
            pp13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp14.setImagePath("");
        pp14.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp14Layout = new javax.swing.GroupLayout(pp14);
        pp14.setLayout(pp14Layout);
        pp14Layout.setHorizontalGroup(
            pp14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp14Layout.setVerticalGroup(
            pp14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp15.setImagePath("");
        pp15.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp15Layout = new javax.swing.GroupLayout(pp15);
        pp15.setLayout(pp15Layout);
        pp15Layout.setHorizontalGroup(
            pp15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp15Layout.setVerticalGroup(
            pp15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp16.setImagePath("");
        pp16.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp16Layout = new javax.swing.GroupLayout(pp16);
        pp16.setLayout(pp16Layout);
        pp16Layout.setHorizontalGroup(
            pp16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp16Layout.setVerticalGroup(
            pp16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp17.setImagePath("");
        pp17.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp17Layout = new javax.swing.GroupLayout(pp17);
        pp17.setLayout(pp17Layout);
        pp17Layout.setHorizontalGroup(
            pp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp17Layout.setVerticalGroup(
            pp17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp18.setImagePath("");
        pp18.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp18Layout = new javax.swing.GroupLayout(pp18);
        pp18.setLayout(pp18Layout);
        pp18Layout.setHorizontalGroup(
            pp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp18Layout.setVerticalGroup(
            pp18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp19.setImagePath("");
        pp19.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp19Layout = new javax.swing.GroupLayout(pp19);
        pp19.setLayout(pp19Layout);
        pp19Layout.setHorizontalGroup(
            pp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp19Layout.setVerticalGroup(
            pp19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp20.setImagePath("");
        pp20.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp20Layout = new javax.swing.GroupLayout(pp20);
        pp20.setLayout(pp20Layout);
        pp20Layout.setHorizontalGroup(
            pp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp20Layout.setVerticalGroup(
            pp20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp21.setImagePath("");
        pp21.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp21Layout = new javax.swing.GroupLayout(pp21);
        pp21.setLayout(pp21Layout);
        pp21Layout.setHorizontalGroup(
            pp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp21Layout.setVerticalGroup(
            pp21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp22.setImagePath("");
        pp22.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp22Layout = new javax.swing.GroupLayout(pp22);
        pp22.setLayout(pp22Layout);
        pp22Layout.setHorizontalGroup(
            pp22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp22Layout.setVerticalGroup(
            pp22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp23.setImagePath("");
        pp23.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp23Layout = new javax.swing.GroupLayout(pp23);
        pp23.setLayout(pp23Layout);
        pp23Layout.setHorizontalGroup(
            pp23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp23Layout.setVerticalGroup(
            pp23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp25.setImagePath("");
        pp25.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp25Layout = new javax.swing.GroupLayout(pp25);
        pp25.setLayout(pp25Layout);
        pp25Layout.setHorizontalGroup(
            pp25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp25Layout.setVerticalGroup(
            pp25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp24.setImagePath("");
        pp24.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp24Layout = new javax.swing.GroupLayout(pp24);
        pp24.setLayout(pp24Layout);
        pp24Layout.setHorizontalGroup(
            pp24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp24Layout.setVerticalGroup(
            pp24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp26.setImagePath("");
        pp26.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp26Layout = new javax.swing.GroupLayout(pp26);
        pp26.setLayout(pp26Layout);
        pp26Layout.setHorizontalGroup(
            pp26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp26Layout.setVerticalGroup(
            pp26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp28.setImagePath("");
        pp28.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp28Layout = new javax.swing.GroupLayout(pp28);
        pp28.setLayout(pp28Layout);
        pp28Layout.setHorizontalGroup(
            pp28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp28Layout.setVerticalGroup(
            pp28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp27.setImagePath("");
        pp27.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp27Layout = new javax.swing.GroupLayout(pp27);
        pp27.setLayout(pp27Layout);
        pp27Layout.setHorizontalGroup(
            pp27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp27Layout.setVerticalGroup(
            pp27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp29.setImagePath("");
        pp29.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp29Layout = new javax.swing.GroupLayout(pp29);
        pp29.setLayout(pp29Layout);
        pp29Layout.setHorizontalGroup(
            pp29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp29Layout.setVerticalGroup(
            pp29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp30.setImagePath("");
        pp30.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp30Layout = new javax.swing.GroupLayout(pp30);
        pp30.setLayout(pp30Layout);
        pp30Layout.setHorizontalGroup(
            pp30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp30Layout.setVerticalGroup(
            pp30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp31.setImagePath("");
        pp31.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp31Layout = new javax.swing.GroupLayout(pp31);
        pp31.setLayout(pp31Layout);
        pp31Layout.setHorizontalGroup(
            pp31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp31Layout.setVerticalGroup(
            pp31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp32.setImagePath("");
        pp32.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp32Layout = new javax.swing.GroupLayout(pp32);
        pp32.setLayout(pp32Layout);
        pp32Layout.setHorizontalGroup(
            pp32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp32Layout.setVerticalGroup(
            pp32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp33.setImagePath("");
        pp33.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp33Layout = new javax.swing.GroupLayout(pp33);
        pp33.setLayout(pp33Layout);
        pp33Layout.setHorizontalGroup(
            pp33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp33Layout.setVerticalGroup(
            pp33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp34.setImagePath("");
        pp34.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp34Layout = new javax.swing.GroupLayout(pp34);
        pp34.setLayout(pp34Layout);
        pp34Layout.setHorizontalGroup(
            pp34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp34Layout.setVerticalGroup(
            pp34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp35.setImagePath("");
        pp35.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp35Layout = new javax.swing.GroupLayout(pp35);
        pp35.setLayout(pp35Layout);
        pp35Layout.setHorizontalGroup(
            pp35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp35Layout.setVerticalGroup(
            pp35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp36.setImagePath("");
        pp36.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp36Layout = new javax.swing.GroupLayout(pp36);
        pp36.setLayout(pp36Layout);
        pp36Layout.setHorizontalGroup(
            pp36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp36Layout.setVerticalGroup(
            pp36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp37.setImagePath("");
        pp37.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp37Layout = new javax.swing.GroupLayout(pp37);
        pp37.setLayout(pp37Layout);
        pp37Layout.setHorizontalGroup(
            pp37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp37Layout.setVerticalGroup(
            pp37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp38.setImagePath("");
        pp38.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp38Layout = new javax.swing.GroupLayout(pp38);
        pp38.setLayout(pp38Layout);
        pp38Layout.setHorizontalGroup(
            pp38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp38Layout.setVerticalGroup(
            pp38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp39.setImagePath("");
        pp39.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp39Layout = new javax.swing.GroupLayout(pp39);
        pp39.setLayout(pp39Layout);
        pp39Layout.setHorizontalGroup(
            pp39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp39Layout.setVerticalGroup(
            pp39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp40.setImagePath("");
        pp40.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp40Layout = new javax.swing.GroupLayout(pp40);
        pp40.setLayout(pp40Layout);
        pp40Layout.setHorizontalGroup(
            pp40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp40Layout.setVerticalGroup(
            pp40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp41.setImagePath("");
        pp41.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp41Layout = new javax.swing.GroupLayout(pp41);
        pp41.setLayout(pp41Layout);
        pp41Layout.setHorizontalGroup(
            pp41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp41Layout.setVerticalGroup(
            pp41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp42.setImagePath("");
        pp42.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp42Layout = new javax.swing.GroupLayout(pp42);
        pp42.setLayout(pp42Layout);
        pp42Layout.setHorizontalGroup(
            pp42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp42Layout.setVerticalGroup(
            pp42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp43.setImagePath("");
        pp43.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp43Layout = new javax.swing.GroupLayout(pp43);
        pp43.setLayout(pp43Layout);
        pp43Layout.setHorizontalGroup(
            pp43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp43Layout.setVerticalGroup(
            pp43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp44.setImagePath("");
        pp44.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp44Layout = new javax.swing.GroupLayout(pp44);
        pp44.setLayout(pp44Layout);
        pp44Layout.setHorizontalGroup(
            pp44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp44Layout.setVerticalGroup(
            pp44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp45.setImagePath("");
        pp45.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp45Layout = new javax.swing.GroupLayout(pp45);
        pp45.setLayout(pp45Layout);
        pp45Layout.setHorizontalGroup(
            pp45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp45Layout.setVerticalGroup(
            pp45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp46.setImagePath("");
        pp46.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp46Layout = new javax.swing.GroupLayout(pp46);
        pp46.setLayout(pp46Layout);
        pp46Layout.setHorizontalGroup(
            pp46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp46Layout.setVerticalGroup(
            pp46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp47.setImagePath("");
        pp47.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp47Layout = new javax.swing.GroupLayout(pp47);
        pp47.setLayout(pp47Layout);
        pp47Layout.setHorizontalGroup(
            pp47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp47Layout.setVerticalGroup(
            pp47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pp48.setImagePath("");
        pp48.setPreferredSize(new java.awt.Dimension(50, 150));

        javax.swing.GroupLayout pp48Layout = new javax.swing.GroupLayout(pp48);
        pp48.setLayout(pp48Layout);
        pp48Layout.setHorizontalGroup(
            pp48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pp48Layout.setVerticalGroup(
            pp48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout imagePanel2Layout = new javax.swing.GroupLayout(imagePanel2);
        imagePanel2.setLayout(imagePanel2Layout);
        imagePanel2Layout.setHorizontalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanel2Layout.createSequentialGroup()
                        .addComponent(pp33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagePanel2Layout.createSequentialGroup()
                        .addComponent(pp17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagePanel2Layout.createSequentialGroup()
                        .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pp16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        imagePanel2Layout.setVerticalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pp16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pp32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pp48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pp33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(23, 36, 49));

        C4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        C4.setName("C4"); // NOI18N
        C4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        C4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        D4b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        D4b.setName("D4b"); // NOI18N
        D4b.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        D4b.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N
        D4b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4bActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Figura musical");

        cbFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negra", "Blanca", "Redonda" }));

        jButton1.setText("Anterior");

        jButton2.setText("Siguiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(cbFigura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(40, 40, 40))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Comienza a ingresar las notas!");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton5.setName("D4"); // NOI18N
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton7.setName("E4"); // NOI18N
        jButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton8.setName("F4"); // NOI18N
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton10.setName("G4"); // NOI18N
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton12.setName("A4"); // NOI18N
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton14.setName("B4"); // NOI18N
        jButton14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton15.setName("C5"); // NOI18N
        jButton15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton15.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton16.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton16.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton17.setName("D5"); // NOI18N
        jButton17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton17.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton18.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton19.setName("E5"); // NOI18N
        jButton19.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton19.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton20.setName("F5"); // NOI18N
        jButton20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton20.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton21.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton21.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton22.setName("G5"); // NOI18N
        jButton22.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton22.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton23.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton23.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton24.setName("A5"); // NOI18N
        jButton24.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton24.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlanca.png"))); // NOI18N
        jButton25.setName("B5"); // NOI18N
        jButton25.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaPresionada.png"))); // NOI18N
        jButton25.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaBlancaSeleccionada.png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegra.png"))); // NOI18N
        jButton26.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraPresionada.png"))); // NOI18N
        jButton26.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Teclas/TeclaNegraSeleccionada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(D4b, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(D4b, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(228, 229, 238));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/playStop.png"))); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reload.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(imagePanel1Layout.createSequentialGroup()
                        .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        accionDeTeclado(evt);
    }//GEN-LAST:event_C4ActionPerformed

    private void D4bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4bActionPerformed

    }//GEN-LAST:event_D4bActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        accionDeTeclado(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       accionDeTeclado(evt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        accionDeTeclado(evt);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      accionDeTeclado(evt);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      accionDeTeclado(evt);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       accionDeTeclado(evt);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       accionDeTeclado(evt);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       accionDeTeclado(evt);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       accionDeTeclado(evt);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       accionDeTeclado(evt);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        accionDeTeclado(evt);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
      accionDeTeclado(evt);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
      accionDeTeclado(evt);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        try {
            ca.play();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton29ActionPerformed

    private void accionDeTeclado(ActionEvent evt){
        
        teclaPulsada = (JButton)evt.getSource();
        cbFigura.getSelectedItem().toString();
        DarBordePanel(obtenerPanel(cp.obtenerIndiceCompas(),cp.obtenerIndiceTiempo()),false);
        pintarPanel(obtenerPanel(cp.obtenerIndiceCompas(),cp.obtenerIndiceTiempo()),teclaPulsada.getName(),cbFigura.getSelectedItem().toString());
        cp.agregarNota(teclaPulsada.getName(),cbFigura.getSelectedItem().toString());
        try{
            ca.reproducirNota(teclaPulsada.getName(),cbFigura.getSelectedItem().toString());
        }catch(Exception e){}
        
        DarBordePanel(obtenerPanel(cp.obtenerIndiceCompas(),cp.obtenerIndiceTiempo()),true);
        
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    
    
    public void DarBordePanel(ImagePanel p,boolean seleccionar)
    {   
        Border b;
        if (seleccionar){
            b = new LineBorder(Color.DARK_GRAY, 3, false);
        }else{
            b = null;
        }
        p.setBorder(b);
    }
    
    public ImagePanel obtenerPanel(int numeroCompas,int numeroTiempo){
        int fila = 200+200*(numeroCompas%4);
        fila = fila+50*(numeroTiempo%4);
        int columna = 150+150*(numeroCompas/4);
        ImagePanel p = (ImagePanel) imagePanel2.getComponentAt(fila,columna);
        return p;
    }
    
    
    private void pintarPanel(ImagePanel p, String nota, String figura) {
        p.setImagePath("/img/Figuras/"+figura+"/"+nota+".png");        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C4;
    private javax.swing.JButton D4b;
    private javax.swing.JComboBox<String> cbFigura;
    private presentacion.ImagePanel imagePanel1;
    private presentacion.ImagePanel imagePanel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private presentacion.ImagePanel pp1;
    private presentacion.ImagePanel pp10;
    private presentacion.ImagePanel pp11;
    private presentacion.ImagePanel pp12;
    private presentacion.ImagePanel pp13;
    private presentacion.ImagePanel pp14;
    private presentacion.ImagePanel pp15;
    private presentacion.ImagePanel pp16;
    private presentacion.ImagePanel pp17;
    private presentacion.ImagePanel pp18;
    private presentacion.ImagePanel pp19;
    private presentacion.ImagePanel pp2;
    private presentacion.ImagePanel pp20;
    private presentacion.ImagePanel pp21;
    private presentacion.ImagePanel pp22;
    private presentacion.ImagePanel pp23;
    private presentacion.ImagePanel pp24;
    private presentacion.ImagePanel pp25;
    private presentacion.ImagePanel pp26;
    private presentacion.ImagePanel pp27;
    private presentacion.ImagePanel pp28;
    private presentacion.ImagePanel pp29;
    private presentacion.ImagePanel pp3;
    private presentacion.ImagePanel pp30;
    private presentacion.ImagePanel pp31;
    private presentacion.ImagePanel pp32;
    private presentacion.ImagePanel pp33;
    private presentacion.ImagePanel pp34;
    private presentacion.ImagePanel pp35;
    private presentacion.ImagePanel pp36;
    private presentacion.ImagePanel pp37;
    private presentacion.ImagePanel pp38;
    private presentacion.ImagePanel pp39;
    private presentacion.ImagePanel pp4;
    private presentacion.ImagePanel pp40;
    private presentacion.ImagePanel pp41;
    private presentacion.ImagePanel pp42;
    private presentacion.ImagePanel pp43;
    private presentacion.ImagePanel pp44;
    private presentacion.ImagePanel pp45;
    private presentacion.ImagePanel pp46;
    private presentacion.ImagePanel pp47;
    private presentacion.ImagePanel pp48;
    private presentacion.ImagePanel pp5;
    private presentacion.ImagePanel pp6;
    private presentacion.ImagePanel pp7;
    private presentacion.ImagePanel pp8;
    private presentacion.ImagePanel pp9;
    // End of variables declaration//GEN-END:variables

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import model.*;


public class AirbnbForm extends javax.swing.JFrame {

    public final Airbnb model;
    public final User user;
    
    public AirbnbForm(Airbnb airbnb, User user) {
        initComponents();
        this.model = airbnb;
        this.user = user;
        
        final var lodgementImages = Arrays.asList(new JButton[]{
            lodgementImage1,
            lodgementImage2,
            lodgementImage3,
        });
                
        final var lblNames = Arrays.asList(new JLabel[]{
            lblName1,
            lblName2,
            lblName3,
        });
        
        
        final var lblLocations = Arrays.asList(new JLabel[]{
            lblLocation1,
            lblLocation2,
            lblLocation3,
        });
        
        final var lblPrice = Arrays.asList(new JLabel[]{
            lblPrice1,
            lblPrice2,
            lblPrice3,
        });
        
        for (int i = 0; i < lodgementImages.size(); i++){
            
            //set Lodgement images
            lodgementImages.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource((this.model.viewLodgement(i)).getImage())));
            final int lodgementIndex = i;
            lodgementImages.get(i).addActionListener((e)->{
                new LodgementForm(model.viewLodgement(lodgementIndex), this.user)
                        .setVisible(true);
            });
            
            //set Lodgement locations
            lblLocations.get(i).setText(model.viewLodgement(i).getLocation());
            //set Lodgement price
            lblPrice.get(i).setText(String.valueOf(model.viewLodgement(i).getAmountDay()) + " € día");
            //set Lodgement names
            lblNames.get(i).setText(model.viewLodgement(i).getName());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Pagar = new javax.swing.JButton();
        GestionarReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblLocation1 = new javax.swing.JLabel();
        lblPrice1 = new javax.swing.JLabel();
        lblLocation2 = new javax.swing.JLabel();
        lblPrice2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblLocation3 = new javax.swing.JLabel();
        lblPrice3 = new javax.swing.JLabel();
        CheckIn = new javax.swing.JButton();
        lodgementImage2 = new javax.swing.JButton();
        lodgementImage3 = new javax.swing.JButton();
        lodgementImage1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("BNB");
        jLabel2.setPreferredSize(new java.awt.Dimension(907, 622));

        Pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pago-en-linea.png"))); // NOI18N
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        GestionarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        GestionarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarReservaActionPerformed(evt);
            }
        });

        jLabel1.setText("PAGAR");

        jLabel3.setText("CHECK-IN");

        jLabel4.setText("GESTIONAR RESERVA");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcador-de-posicion.png"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName1.setText("Apartamento Rural con Granja");

        lblLocation1.setText("La Roza, Asturias");

        lblPrice1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrice1.setText("235 € noche");

        lblLocation2.setText("Viseu, Portugal");

        lblPrice2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrice2.setText("120 € noche");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcador-de-posicion.png"))); // NOI18N

        lblName2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName2.setText("Casa completa con piscina privada");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcador-de-posicion.png"))); // NOI18N

        lblName3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName3.setText("Villa Luxury Soulhouse ");

        lblLocation3.setText("Marbella, Andalucía");

        lblPrice3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPrice3.setText("2895 € noche");

        CheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista-de-verificacion.png"))); // NOI18N
        CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInActionPerformed(evt);
            }
        });

        lodgementImage2.setText("Image2");

        lodgementImage3.setText("Image3");

        lodgementImage1.setText("Image1");
        lodgementImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lodgementImage1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblLocation1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice1))
                        .addComponent(lodgementImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblLocation2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrice2))
                        .addComponent(lodgementImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblName3)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLocation3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrice3))
                    .addComponent(lodgementImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pagar)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GestionarReserva)
                                .addGap(85, 85, 85)
                                .addComponent(CheckIn)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLocation3)
                                .addComponent(lblPrice3)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel21))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GestionarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lodgementImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lodgementImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lodgementImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName1)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLocation1)
                                        .addComponent(lblPrice1))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblName2)
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel15))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLocation2)
                                    .addComponent(lblPrice2))))))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        Pagar.setToolTipText("Pagar");
        GestionarReserva.setToolTipText("Gestionar Reserva");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarReservaActionPerformed
        // TODO add your handling code here:
        ReservationForm b = new ReservationForm(user, null);
        b.setVisible(true);   
    }//GEN-LAST:event_GestionarReservaActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        // TODO add your handling code here:
        PayForm f = new PayForm(user);
        f.setVisible(true);
    }//GEN-LAST:event_PagarActionPerformed

    private void CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInActionPerformed
        // TODO add your handling code here:
        
        CheckInForm d = new CheckInForm(user);
        d.setVisible(true);
    }//GEN-LAST:event_CheckInActionPerformed

    private void lodgementImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lodgementImage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lodgementImage1ActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckIn;
    private javax.swing.JButton GestionarReserva;
    private javax.swing.JButton Pagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLocation1;
    private javax.swing.JLabel lblLocation2;
    private javax.swing.JLabel lblLocation3;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblPrice3;
    private javax.swing.JButton lodgementImage1;
    private javax.swing.JButton lodgementImage2;
    private javax.swing.JButton lodgementImage3;
    // End of variables declaration//GEN-END:variables
}

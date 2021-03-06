///////////////////////////////////////////////////////////////////////////////
// AUTHOR:       Henry Pinkard, henry.pinkard@gmail.com
//
// COPYRIGHT:    University of California, San Francisco, 2015
//
// LICENSE:      This file is distributed under the BSD license.
//               License text is included with the source distribution.
//
//               This file is distributed in the hope that it will be useful,
//               but WITHOUT ANY WARRANTY; without even the implied warranty
//               of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
//
//               IN NO EVENT SHALL THE COPYRIGHT OWNER OR
//               CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
//               INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES.
//
package org.micromanager.plugins.magellan.surfacesandregions;

import javax.swing.DefaultComboBoxModel;
import org.micromanager.plugins.magellan.propsandcovariants.CurvedSurfaceCalculations;

/**
 *
 * @author Henry
 */
public class CurvedSurfaceCovariantCreationDialog extends javax.swing.JFrame {
   
   private volatile Object waitObject_ = new Object();
   private volatile boolean canceled_ = false;
   private volatile  boolean finished_ = false;
   
   /**
    * Creates new form CurvedSurfaceCovariantCreationDialog
    */
   public CurvedSurfaceCovariantCreationDialog() {
      initComponents();
      this.setLocationRelativeTo(null);
      radiusCombo_.setSelectedItem(null);
      this.setVisible(true);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mfpCombo_ = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        mfpLabel_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radiusCombo_ = new javax.swing.JComboBox();
        powerSpinner_ = new javax.swing.JSpinner();
        okButton_ = new javax.swing.JButton();
        cancelButton_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Select precalculated curved surface parameters");

        mfpCombo_.setModel(new DefaultComboBoxModel());
        mfpCombo_.setEnabled(false);
        mfpCombo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfpCombo_ActionPerformed(evt);
            }
        });

        jLabel1.setText("Base Power (EOM Voltage): ");

        mfpLabel_.setText("Mean free path: ");
        mfpLabel_.setEnabled(false);

        jLabel3.setText("Radius of curvature: ");

        radiusCombo_.setModel(new DefaultComboBoxModel(CurvedSurfaceCalculations.getAvailableRadiiOfCurvature()));
        radiusCombo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiusCombo_ActionPerformed(evt);
            }
        });

        powerSpinner_.setModel(new javax.swing.SpinnerNumberModel(0.1d, 1.0E-5d, 10.0d, 0.01d));

        okButton_.setText("Ok");
        okButton_.setEnabled(false);
        okButton_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButton_ActionPerformed(evt);
            }
        });

        cancelButton_.setText("Cancel");
        cancelButton_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mfpLabel_)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mfpCombo_, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiusCombo_, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(247, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(powerSpinner_, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelButton_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okButton_)
                        .addGap(148, 148, 148))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(powerSpinner_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radiusCombo_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mfpLabel_)
                    .addComponent(mfpCombo_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton_)
                    .addComponent(okButton_))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void okButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButton_ActionPerformed
     finished_ = true;
      synchronized (waitObject_) {
         waitObject_.notify();
      }
      this.setVisible(false);
   }//GEN-LAST:event_okButton_ActionPerformed

   private void mfpCombo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfpCombo_ActionPerformed
      okButton_.setEnabled(true);
   }//GEN-LAST:event_mfpCombo_ActionPerformed

   private void radiusCombo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiusCombo_ActionPerformed
      if (radiusCombo_.getSelectedItem() == null) {
         return;
      }
      mfpCombo_.setModel(new DefaultComboBoxModel(CurvedSurfaceCalculations.getAvailableMeanFreePathLengths(Integer.parseInt( radiusCombo_.getSelectedItem().toString()))));
      mfpCombo_.setEnabled(true);
      mfpLabel_.setEnabled(true);
      mfpCombo_.setSelectedItem(null);
   }//GEN-LAST:event_radiusCombo_ActionPerformed

   private void cancelButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton_ActionPerformed
      canceled_ = true;
      finished_ = true;
      synchronized (waitObject_) {
         waitObject_.notifyAll();
      }
      this.setVisible(false);
      this.dispose();
   }//GEN-LAST:event_cancelButton_ActionPerformed

   public int getRadiusOfCurvature() {
      return Integer.parseInt(radiusCombo_.getSelectedItem().toString());
   }
   
   public int getMFP() {
      return Integer.parseInt(mfpCombo_.getSelectedItem().toString());
   }
   
   public double getBaseVoltage() {
      return (Double) powerSpinner_.getValue();
   }
   
   public void waitForCreationOrCancel() {
      while (!finished_) {
         synchronized (waitObject_) {
            try {
               waitObject_.wait();
            } catch (InterruptedException ex) {             
            }
         }
      }
   }
   
   public boolean wasCanceled() {
      return canceled_;
   }
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox mfpCombo_;
    private javax.swing.JLabel mfpLabel_;
    private javax.swing.JButton okButton_;
    private javax.swing.JSpinner powerSpinner_;
    private javax.swing.JComboBox radiusCombo_;
    // End of variables declaration//GEN-END:variables
}

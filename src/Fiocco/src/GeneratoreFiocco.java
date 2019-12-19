import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Classe che contine il triangolo e il fiocco.
 * @author Daniel Matt
 */
public class GeneratoreFiocco extends javax.swing.JFrame {

    /**
     * Metodo Costruttore.
     */
    public GeneratoreFiocco() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsPanel = new javax.swing.JPanel();
        setColorTriangolo = new javax.swing.JButton();
        setColorFiocco = new javax.swing.JButton();
        resetPoints = new javax.swing.JButton();
        addPolygon = new javax.swing.JButton();
        removeLastPoint = new javax.swing.JButton();
        renderTriangolo = new javax.swing.JToggleButton();
        savePoint = new javax.swing.JButton();
        generaFiocco = new javax.swing.JButton();
        saveAsSVG = new javax.swing.JButton();
        saveAsPNG = new javax.swing.JButton();
        panelBack = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        fioccoPanel1 = new FioccoPanel();
        triangoloPanel = new TriangoloPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        buttonsPanel.setBackground(new java.awt.Color(0, 51, 204));

        setColorTriangolo.setText("Set Triangle Color");
        setColorTriangolo.setFocusable(false);
        setColorTriangolo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setColorTriangolo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        setColorTriangolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setColorTriangoloActionPerformed(evt);
            }
        });
        buttonsPanel.add(setColorTriangolo);

        setColorFiocco.setText("Set SnowFlake Color");
        setColorFiocco.setFocusable(false);
        setColorFiocco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setColorFiocco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        setColorFiocco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setColorFioccoActionPerformed(evt);
            }
        });
        buttonsPanel.add(setColorFiocco);

        resetPoints.setText("Reset");
        resetPoints.setFocusable(false);
        resetPoints.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetPoints.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resetPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPointsActionPerformed(evt);
            }
        });
        buttonsPanel.add(resetPoints);

        addPolygon.setText("Add Polygon");
        addPolygon.setFocusable(false);
        addPolygon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addPolygon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addPolygon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPolygonActionPerformed(evt);
            }
        });
        buttonsPanel.add(addPolygon);

        removeLastPoint.setText("Remove Last Point");
        removeLastPoint.setFocusable(false);
        removeLastPoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeLastPoint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removeLastPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeLastPointActionPerformed(evt);
            }
        });
        buttonsPanel.add(removeLastPoint);

        renderTriangolo.setText("Render");
        renderTriangolo.setFocusable(false);
        renderTriangolo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        renderTriangolo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        renderTriangolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renderTriangoloActionPerformed(evt);
            }
        });
        buttonsPanel.add(renderTriangolo);

        savePoint.setText("Save Polygons");
        savePoint.setFocusable(false);
        savePoint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        savePoint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        savePoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePointActionPerformed(evt);
            }
        });
        buttonsPanel.add(savePoint);

        generaFiocco.setText("Genera");
        generaFiocco.setFocusable(false);
        generaFiocco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        generaFiocco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        generaFiocco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaFioccoActionPerformed(evt);
            }
        });
        buttonsPanel.add(generaFiocco);

        saveAsSVG.setText("Save SnowFlake as SVG");
        saveAsSVG.setFocusable(false);
        saveAsSVG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveAsSVG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveAsSVG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsSVGActionPerformed(evt);
            }
        });
        buttonsPanel.add(saveAsSVG);

        saveAsPNG.setText("Save Snowflake as PNG");
        saveAsPNG.setFocusable(false);
        saveAsPNG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveAsPNG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveAsPNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsPNGActionPerformed(evt);
            }
        });
        buttonsPanel.add(saveAsPNG);

        getContentPane().add(buttonsPanel, java.awt.BorderLayout.PAGE_END);

        panelBack.setLayout(new java.awt.CardLayout());

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        panelBack.add(back, "card2");

        getContentPane().add(panelBack, java.awt.BorderLayout.PAGE_START);

        fioccoPanel1.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout fioccoPanel1Layout = new javax.swing.GroupLayout(fioccoPanel1);
        fioccoPanel1.setLayout(fioccoPanel1Layout);
        fioccoPanel1Layout.setHorizontalGroup(
            fioccoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        fioccoPanel1Layout.setVerticalGroup(
            fioccoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        getContentPane().add(fioccoPanel1, java.awt.BorderLayout.CENTER);

        triangoloPanel.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout triangoloPanelLayout = new javax.swing.GroupLayout(triangoloPanel);
        triangoloPanel.setLayout(triangoloPanelLayout);
        triangoloPanelLayout.setHorizontalGroup(
            triangoloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        triangoloPanelLayout.setVerticalGroup(
            triangoloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        getContentPane().add(triangoloPanel, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Si occupa di tornare alla home del programma.
     * @param evt evento scatenato dal bottone.
     */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new GUI().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    /**
     * Quando invocato si occupa di resettare tutti i poligoni di taglio.
     * @param evt evento scatenato dal bottone.
     */
    private void resetPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPointsActionPerformed
        triangoloPanel.resetPoints();
        fioccoPanel1.setFiocco(triangoloPanel.generaFiocco());
        fioccoPanel1.repaint();
    }//GEN-LAST:event_resetPointsActionPerformed

    /**
     * Quando invocato si occupa di aggiungere un nuovo poligono di taglio.
     * @param evt evento scatenato dal bottone.
     */
    private void addPolygonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPolygonActionPerformed
        triangoloPanel.addPolygon();
        fioccoPanel1.setFiocco(triangoloPanel.generaFiocco());
        fioccoPanel1.repaint();
    }//GEN-LAST:event_addPolygonActionPerformed

    /**
     * Si occupa di rimuovere solo l'ultimo punto dell'ultimo poligono di taglio.
     * @param evt evento scatenato dal bottone.
     */
    private void removeLastPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeLastPointActionPerformed
       triangoloPanel.removeLastPoint();
       fioccoPanel1.setFiocco(triangoloPanel.generaFiocco());
       fioccoPanel1.repaint();
    }//GEN-LAST:event_removeLastPointActionPerformed

    /**
     * Si occupa di generare il fiocco.
     * @param evt evento scatenato dal bottone.
     */
    private void generaFioccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaFioccoActionPerformed
        fioccoPanel1.setFiocco(triangoloPanel.generaFiocco());
        fioccoPanel1.repaint();
    }//GEN-LAST:event_generaFioccoActionPerformed

    /**
     * Si occupa di renderizzare il triangolo.
     * @param evt evento scatenato dal bottone.
     */
    private void renderTriangoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renderTriangoloActionPerformed
        triangoloPanel.showRender = !triangoloPanel.showRender;
    }//GEN-LAST:event_renderTriangoloActionPerformed

    /**
     * Si occupa di salvare i punti dei poligoni di taglio.
     * @param evt evento scatenato dal bottone.
     */
    private void savePointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePointActionPerformed
        triangoloPanel.savePoint();
    }//GEN-LAST:event_savePointActionPerformed

    /**
     * Si occupa di aprire una finestra di dialogo per salvare il fiocco generato
     * in immagine vettoriale.
     * @param evt evento scatenato dal bottone.
     */
    private void saveAsSVGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsSVGActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fnf = new FileNameExtensionFilter("SVG File (*.svg)", "SVG");
        jfc.setFileFilter(fnf);
        jfc.showDialog(null, "Save");
        try{
            String handle = new String(jfc.getSelectedFile().toPath().toString());
            fioccoPanel1.generaSVG(handle);
        }catch(NullPointerException npe){
        }
        
    }//GEN-LAST:event_saveAsSVGActionPerformed

    /**
     * Si occupa di settare il colore del triangolo
     * @param evt evento scatenato dal bottone.
     */
    private void setColorTriangoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setColorTriangoloActionPerformed
        triangoloPanel.setColor(JColorChooser.showDialog(null, "Farbauswahl", null));
    }//GEN-LAST:event_setColorTriangoloActionPerformed

    /**
     * Si occupa di settare il colore del fiocco.
     * @param evt evento scatenato dal bottone.
     */
    private void setColorFioccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setColorFioccoActionPerformed
        fioccoPanel1.setColor(JColorChooser.showDialog(null, "Farbauswahl", null));
    }//GEN-LAST:event_setColorFioccoActionPerformed

    private void saveAsPNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsPNGActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fnf = new FileNameExtensionFilter("PNG File (*.png)", "PNG");
        jfc.setFileFilter(fnf);
        jfc.showDialog(null, "Save");
        try{
            String handle = new String(jfc.getSelectedFile().toPath().toString());
            fioccoPanel1.generaPNG(handle);
        }catch(NullPointerException npe){
        }
    }//GEN-LAST:event_saveAsPNGActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneratoreFiocco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratoreFiocco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratoreFiocco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratoreFiocco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratoreFiocco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPolygon;
    private javax.swing.JButton back;
    private javax.swing.JPanel buttonsPanel;
    private FioccoPanel fioccoPanel1;
    private javax.swing.JButton generaFiocco;
    private javax.swing.JPanel panelBack;
    private javax.swing.JButton removeLastPoint;
    private javax.swing.JToggleButton renderTriangolo;
    private javax.swing.JButton resetPoints;
    private javax.swing.JButton saveAsPNG;
    private javax.swing.JButton saveAsSVG;
    private javax.swing.JButton savePoint;
    private javax.swing.JButton setColorFiocco;
    private javax.swing.JButton setColorTriangolo;
    private TriangoloPanel triangoloPanel;
    // End of variables declaration//GEN-END:variables
}

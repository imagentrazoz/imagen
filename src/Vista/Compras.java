/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.con_com;
import java.awt.Color;




/**
 *
 * @author Windows 10
 */
public class Compras extends javax.swing.JFrame {

    public Compras() {
        initComponents();
        limpiar();
        //insertamos la ruta de nuestar imagen
        
        /* ImageIcon logo1=new ImageIcon(getClass().getResource("/imagenes/logo.jpg"));
        Icon fondo1= new ImageIcon(logo1.getImage().getScaledInstance(lbllogo1.getWidth(),
                lbllogo1.getHeight(),
                Image.SCALE_DEFAULT));
                lbllogo1.setIcon(fondo1);
                this.repaint();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        proveedores = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        compra = new javax.swing.JButton();
        factura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cod_compra = new javax.swing.JTextField();
        cod_factura = new javax.swing.JTextField();
        cod_producto = new javax.swing.JTextField();
        cantidad_c = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        factura1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        proveedores.setBackground(new java.awt.Color(255, 204, 51));
        proveedores.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        proveedores.setForeground(new java.awt.Color(0, 0, 0));
        proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        proveedores.setText("REGISTRO PROVEEDORES");
        proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        proveedores.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        proveedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right_17841.png"))); // NOI18N
        proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                proveedoresMousePressed(evt);
            }
        });

        productos.setBackground(new java.awt.Color(255, 204, 51));
        productos.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        productos.setForeground(new java.awt.Color(0, 0, 0));
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        productos.setText("REGISTRO PRODCUTOS");
        productos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        productos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right_17841.png"))); // NOI18N
        productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productosMousePressed(evt);
            }
        });
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });

        compra.setBackground(new java.awt.Color(255, 204, 51));
        compra.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        compra.setForeground(new java.awt.Color(0, 0, 0));
        compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        compra.setText("REGISTRAR COMPRA");
        compra.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        compra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right_17841.png"))); // NOI18N
        compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                compraMousePressed(evt);
            }
        });

        factura.setBackground(new java.awt.Color(255, 204, 51));
        factura.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        factura.setForeground(new java.awt.Color(0, 0, 0));
        factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        factura.setText("FACTURA");
        factura.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        factura.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right_17841.png"))); // NOI18N
        factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                facturaMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("REGISTRO DE COMPRAS");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton8.setBackground(new java.awt.Color(255, 204, 51));
        jButton8.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 40)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/m.png"))); // NOI18N
        jButton8.setText("MENU");
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/m2.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cod Compra   :");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cod Factura  :");

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cantidad :");

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Fecha :");

        cod_compra.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        cod_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_compraActionPerformed(evt);
            }
        });

        cod_factura.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        cod_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_facturaActionPerformed(evt);
            }
        });

        cod_producto.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        cod_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_productoActionPerformed(evt);
            }
        });

        cantidad_c.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        cantidad_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_cActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(204, 204, 255));
        borrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(0, 0, 0));
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/T1.png"))); // NOI18N
        borrar.setText("BORRAR");
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/T2.png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(204, 204, 255));
        registrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/R4.png"))); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.setToolTipText("");
        registrar.setBorder(null);
        registrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        registrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/r2.png"))); // NOI18N
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cod Producto :");

        fecha.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cantidad_c, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cod_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cod_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cod_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pie.jpg"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        factura1.setBackground(new java.awt.Color(255, 204, 51));
        factura1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        factura1.setForeground(new java.awt.Color(0, 0, 0));
        factura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        factura1.setText("SALIR");
        factura1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        factura1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_right_17841.png"))); // NOI18N
        factura1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                factura1MousePressed(evt);
            }
        });
        factura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factura1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(425, 425, 425)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(406, 406, 406)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(factura1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(proveedores)
                        .addGap(26, 26, 26)
                        .addComponent(productos)
                        .addGap(18, 18, 18)
                        .addComponent(compra)
                        .addGap(18, 18, 18)
                        .addComponent(factura))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(factura1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void cantidad_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad_cActionPerformed

    private void cod_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_productoActionPerformed

    private void cod_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_facturaActionPerformed

    private void cod_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_compraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_compraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosActionPerformed

    private void proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseExited

    }//GEN-LAST:event_proveedoresMouseExited

    private void proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMouseEntered

    }//GEN-LAST:event_proveedoresMouseEntered

    private void proveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proveedoresMousePressed
         Proveedor p1=new Proveedor ();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_proveedoresMousePressed

    private void productosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productosMousePressed
     Productos p2=new Productos ();
        p2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productosMousePressed

    private void compraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraMousePressed
         Compras c1=new Compras ();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_compraMousePressed

    private void facturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaMousePressed
        Factura f1=new Factura ();
        f1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_facturaMousePressed

    private void factura1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_factura1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_factura1MousePressed

    private void factura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factura1ActionPerformed
      inicio_sesion p1=new inicio_sesion ();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_factura1ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        con_com pr=new con_com();
        String compr=(cod_compra  .getText());
        String factu=(cod_factura .getText());
        String producto=(cod_producto  .getText());
        int can=Integer.parseInt(cantidad_c.getText());
        String fec=(fecha.getText());
        pr.ins(compr,factu,producto,can,fec);
    }//GEN-LAST:event_registrarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       limpiar();
    }//GEN-LAST:event_borrarActionPerformed
 
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JTextField cantidad_c;
    private javax.swing.JTextField cod_compra;
    private javax.swing.JTextField cod_factura;
    private javax.swing.JTextField cod_producto;
    private javax.swing.JButton compra;
    private javax.swing.JButton factura;
    private javax.swing.JButton factura1;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
  private void limpiar() {                                       
        cod_compra.setText("");
        cod_factura.setText("");
        cod_producto.setText("");
        cantidad_c.setText("");
        fecha.setText("");
    } 
    private static class loginBtn {

        private static void setBackground(Color color) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public loginBtn() {
        }
    }
}
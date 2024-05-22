/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {
      
    public Menu() {
        //TITULO DEL PROGRAMA Y ICONO 
        initComponents();
         // Establecer el ícono de la aplicación
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagen/icono.png"));
        setIconImage(icono.getImage());
        // Establecer el título de la ventana
        setTitle("Casino Duoc UC ");
        
         
        // Configuración del JFrame
        setSize(1400, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ruta de la imagen que quieres cargar
        String imagePath = "/imagen/fondo.jpg";

        // Crear un JPanel y establecer la imagen como fondo
        JPanel imagePanel = new JPanel() {
            @Override
             protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon(imagePath);
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Establecer el diseño del JPanel
        imagePanel.setLayout(new BorderLayout());

        // Agregar el JPanel al JFrame
        add(imagePanel);

        // Hacer visible el JFrame
        setVisible(true);
        
    
    }
    

    private void MostrarPanel(JPanel p) {
  
        p.setSize(865, 617);
        p.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        BAR_SALIR_DEL_PROGRAMA_ = new javax.swing.JRadioButtonMenuItem();
        BAR_ELIMINAR_PRODUCTO = new javax.swing.JRadioButtonMenuItem();
        BAR_LISTAR_PRODUCTO = new javax.swing.JRadioButtonMenuItem();
        BAR_MODIFICIAR_PRODUCTO = new javax.swing.JRadioButtonMenuItem();
        BAR_AGREGAR_PRODUCTO = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(14, 14, 53));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(4, 4, 23));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU DE OPCIONES ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 450, 70));

        jPanel6.setBackground(new java.awt.Color(8, 8, 36));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("AGREGAR PRODUCTO");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 40));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("LISTAR  PRODUCTOS");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 180, 40));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("SALIR DEL PROGRAMA");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 180, 40));

        jPanel7.setBackground(new java.awt.Color(7, 7, 28));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Salir.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 50, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/modificar.png"))); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar_.png"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eliminar_.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 40, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/listar_.png"))); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, 40));

        jSeparator1.setBackground(new java.awt.Color(5, 5, 61));
        jSeparator1.setForeground(new java.awt.Color(5, 5, 61));
        jPanel7.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 30, -1));

        jSeparator2.setBackground(new java.awt.Color(50, 5, 61));
        jSeparator2.setForeground(new java.awt.Color(50, 5, 61));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 30, 10));

        jSeparator3.setBackground(new java.awt.Color(50, 5, 61));
        jSeparator3.setForeground(new java.awt.Color(50, 5, 61));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 30, 10));

        jSeparator4.setBackground(new java.awt.Color(5, 5, 61));
        jSeparator4.setForeground(new java.awt.Color(5, 5, 61));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 30, 10));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 490));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("ELIMINAR PRODUCTO");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 180, 40));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("MODIFICAR PRODUCTO");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 40));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 490));

        jButtonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.setBorder(null);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 148, 40));

        jButtonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEliminar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setBorder(null);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 148, 40));

        jButtonModificar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonModificar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.setBorder(null);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 148, 40));

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(null);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 148, 40));

        jButtonListar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonListar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonListar.setText("Listar");
        jButtonListar.setBorder(null);
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 148, 40));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 139, 430, -1));

        contenedor.setBackground(new java.awt.Color(14, 14, 53));
        contenedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );

        jPanel4.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 12, -1, 617));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/LogoDuoc.png"))); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 449, 103));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 51));
        jMenuBar1.setBorder(null);

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Opciones");
        jMenu1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        jMenu6.setBorder(null);
        jMenu6.setForeground(new java.awt.Color(0, 0, 0));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/menu.png"))); // NOI18N
        jMenu6.setText("MENU ");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        BAR_SALIR_DEL_PROGRAMA_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        BAR_SALIR_DEL_PROGRAMA_.setBackground(new java.awt.Color(102, 255, 102));
        BAR_SALIR_DEL_PROGRAMA_.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BAR_SALIR_DEL_PROGRAMA_.setForeground(new java.awt.Color(0, 51, 0));
        BAR_SALIR_DEL_PROGRAMA_.setSelected(true);
        BAR_SALIR_DEL_PROGRAMA_.setText("AGREGAR PRODUTO");
        BAR_SALIR_DEL_PROGRAMA_.setBorder(null);
        BAR_SALIR_DEL_PROGRAMA_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/agregar_.png"))); // NOI18N
        BAR_SALIR_DEL_PROGRAMA_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAR_SALIR_DEL_PROGRAMA_ActionPerformed(evt);
            }
        });
        jMenu6.add(BAR_SALIR_DEL_PROGRAMA_);

        BAR_ELIMINAR_PRODUCTO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        BAR_ELIMINAR_PRODUCTO.setBackground(new java.awt.Color(255, 51, 51));
        BAR_ELIMINAR_PRODUCTO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BAR_ELIMINAR_PRODUCTO.setForeground(new java.awt.Color(51, 0, 0));
        BAR_ELIMINAR_PRODUCTO.setSelected(true);
        BAR_ELIMINAR_PRODUCTO.setText("ELIMINAR PRODUCTO");
        BAR_ELIMINAR_PRODUCTO.setBorder(null);
        BAR_ELIMINAR_PRODUCTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eliminar_.png"))); // NOI18N
        BAR_ELIMINAR_PRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAR_ELIMINAR_PRODUCTOActionPerformed(evt);
            }
        });
        jMenu6.add(BAR_ELIMINAR_PRODUCTO);

        BAR_LISTAR_PRODUCTO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        BAR_LISTAR_PRODUCTO.setBackground(new java.awt.Color(51, 153, 255));
        BAR_LISTAR_PRODUCTO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BAR_LISTAR_PRODUCTO.setForeground(new java.awt.Color(0, 51, 51));
        BAR_LISTAR_PRODUCTO.setSelected(true);
        BAR_LISTAR_PRODUCTO.setText("LISTAR PRODUCTO");
        BAR_LISTAR_PRODUCTO.setBorder(null);
        BAR_LISTAR_PRODUCTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/listar_.png"))); // NOI18N
        BAR_LISTAR_PRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAR_LISTAR_PRODUCTOActionPerformed(evt);
            }
        });
        jMenu6.add(BAR_LISTAR_PRODUCTO);

        BAR_MODIFICIAR_PRODUCTO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        BAR_MODIFICIAR_PRODUCTO.setBackground(new java.awt.Color(255, 255, 51));
        BAR_MODIFICIAR_PRODUCTO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BAR_MODIFICIAR_PRODUCTO.setForeground(new java.awt.Color(51, 51, 0));
        BAR_MODIFICIAR_PRODUCTO.setSelected(true);
        BAR_MODIFICIAR_PRODUCTO.setText("MODIFICAR PRODUCTO");
        BAR_MODIFICIAR_PRODUCTO.setBorder(null);
        BAR_MODIFICIAR_PRODUCTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/modificar.png"))); // NOI18N
        BAR_MODIFICIAR_PRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAR_MODIFICIAR_PRODUCTOActionPerformed(evt);
            }
        });
        jMenu6.add(BAR_MODIFICIAR_PRODUCTO);

        BAR_AGREGAR_PRODUCTO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        BAR_AGREGAR_PRODUCTO.setBackground(new java.awt.Color(204, 0, 0));
        BAR_AGREGAR_PRODUCTO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BAR_AGREGAR_PRODUCTO.setForeground(new java.awt.Color(0, 0, 0));
        BAR_AGREGAR_PRODUCTO.setSelected(true);
        BAR_AGREGAR_PRODUCTO.setText("SALIR DEL PROGRAMA");
        BAR_AGREGAR_PRODUCTO.setBorder(null);
        BAR_AGREGAR_PRODUCTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Salir.png"))); // NOI18N
        BAR_AGREGAR_PRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAR_AGREGAR_PRODUCTOActionPerformed(evt);
            }
        });
        jMenu6.add(BAR_AGREGAR_PRODUCTO);

        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu5.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Servicio");
        jMenu5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenu3.setBorder(null);
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/servicio_tecnico.png"))); // NOI18N
        jMenu3.setText("SERVICIO");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/celular_tecnico.png"))); // NOI18N
        jMenuItem2.setText("TELEFONO:   9 3366 8775");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/correo_electronico_tecnico.png"))); // NOI18N
        jMenuItem1.setText("CORREO: br.casas@duocuc.cl");
        jMenu3.add(jMenuItem1);

        jMenu5.add(jMenu3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Agregar ag1 = new Agregar();
        MostrarPanel(ag1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        //BOTON: SALIR DEL PROGRAMA
        System.exit(WIDTH);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        Listar lis1 = new Listar();
        MostrarPanel(lis1);
        
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Eliminar eli1 = new Eliminar();
        MostrarPanel(eli1);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Modificar mod1 = new Modificar();
        MostrarPanel(mod1);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void BAR_SALIR_DEL_PROGRAMA_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAR_SALIR_DEL_PROGRAMA_ActionPerformed
     //BAR MENU:
      Agregar ag1 = new Agregar();
      MostrarPanel(ag1);
         
    }//GEN-LAST:event_BAR_SALIR_DEL_PROGRAMA_ActionPerformed

    private void BAR_AGREGAR_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAR_AGREGAR_PRODUCTOActionPerformed
    //OPCION BAR:
        System.exit(WIDTH);
    }//GEN-LAST:event_BAR_AGREGAR_PRODUCTOActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void BAR_ELIMINAR_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAR_ELIMINAR_PRODUCTOActionPerformed
        Eliminar el1 = new Eliminar();
      MostrarPanel(el1);
    }//GEN-LAST:event_BAR_ELIMINAR_PRODUCTOActionPerformed

    private void BAR_LISTAR_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAR_LISTAR_PRODUCTOActionPerformed
        Listar lis1 = new Listar();
      MostrarPanel(lis1);
    }//GEN-LAST:event_BAR_LISTAR_PRODUCTOActionPerformed

    private void BAR_MODIFICIAR_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAR_MODIFICIAR_PRODUCTOActionPerformed
        Modificar mod1 = new Modificar();
      MostrarPanel(mod1);
    }//GEN-LAST:event_BAR_MODIFICIAR_PRODUCTOActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
            
        });
    }
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify
    // Variables declaration - do not modify

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem BAR_AGREGAR_PRODUCTO;
    private javax.swing.JRadioButtonMenuItem BAR_ELIMINAR_PRODUCTO;
    private javax.swing.JRadioButtonMenuItem BAR_LISTAR_PRODUCTO;
    private javax.swing.JRadioButtonMenuItem BAR_MODIFICIAR_PRODUCTO;
    private javax.swing.JRadioButtonMenuItem BAR_SALIR_DEL_PROGRAMA_;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}

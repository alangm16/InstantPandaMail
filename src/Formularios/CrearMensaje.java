package Formularios;

import Clases.ComprobarConexionInternet;
import Clases.EnviarMail;
import java.awt.Toolkit;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CrearMensaje extends javax.swing.JFrame {

    //Declara una variable string para añadir un archivo adjunto
    public String adjunto;
    //verifica la conexión
    private boolean conexion;
    String correo;
    String contraseña;
    String nombre;
    String archivo;
    
    public CrearMensaje(String correo, String contra) {
        this.correo = correo;
        this.contraseña = contra;
        initComponents();
        //Agregamos un icono a nuestra aplicación para que se muestre en nuestra barra de tareas al momento de iniciar
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Formularios/icono.png")));        
    }
    
    private CrearMensaje(){
        
    }
    //verifica la conexión a internet
    public void verificarConexion()
    {
        ComprobarConexionInternet google = new ComprobarConexionInternet();
        conexion = google.test();
        System.out.println(conexion);
        
        if(conexion)
        {
            System.out.println("Esta conectado a internet");
            
        }
        else
        {
            //Si no hay conexión a internet no permite enviar el mensaje
            System.out.println("No hay conexion");
            jLab_EstadoInternet.setText("Sin conexión a internet");
            jTF_Destinatario.setEnabled(conexion);
            jTF_Asunto.setEnabled(false);
            jTA_Mensaje.setEnabled(false);
            jBut_Enviar.setEnabled(false);
            jBut_Descartar.setEnabled(false);
            jBut_Adjuntar.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTF_Destinatario = new javax.swing.JTextField();
        jTF_Asunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_Mensaje = new javax.swing.JTextArea();
        jBut_Enviar = new javax.swing.JButton();
        jBut_Descartar = new javax.swing.JButton();
        jBut_Adjuntar = new javax.swing.JButton();
        jBut_CerrarSesion = new javax.swing.JButton();
        jBut_ActualizarConexion = new javax.swing.JButton();
        jLab_EstadoInternet = new javax.swing.JLabel();
        jTF_Adjunto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabEstado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButCCO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InstantPandaMail");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para:");

        jTF_Destinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_DestinatarioActionPerformed(evt);
            }
        });

        jTF_Asunto.setToolTipText("");

        jTA_Mensaje.setColumns(20);
        jTA_Mensaje.setRows(5);
        jScrollPane1.setViewportView(jTA_Mensaje);

        jBut_Enviar.setBackground(new java.awt.Color(255, 0, 0));
        jBut_Enviar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBut_Enviar.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Enviar.setText("ENVIAR ");
        jBut_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_EnviarActionPerformed(evt);
            }
        });

        jBut_Descartar.setBackground(new java.awt.Color(255, 0, 0));
        jBut_Descartar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBut_Descartar.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Descartar.setText("DESCARTAR");
        jBut_Descartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_DescartarActionPerformed(evt);
            }
        });

        jBut_Adjuntar.setBackground(new java.awt.Color(255, 0, 0));
        jBut_Adjuntar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBut_Adjuntar.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Adjuntar.setText("ADJUNTAR");
        jBut_Adjuntar.setToolTipText("Adjuntar");
        jBut_Adjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AdjuntarActionPerformed(evt);
            }
        });

        jBut_CerrarSesion.setBackground(new java.awt.Color(255, 0, 0));
        jBut_CerrarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBut_CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jBut_CerrarSesion.setText("CERRAR SESIÓN");
        jBut_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CerrarSesionActionPerformed(evt);
            }
        });

        jBut_ActualizarConexion.setBackground(new java.awt.Color(255, 0, 0));
        jBut_ActualizarConexion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBut_ActualizarConexion.setForeground(new java.awt.Color(255, 255, 255));
        jBut_ActualizarConexion.setText("Actualizar Conexión a Internet");
        jBut_ActualizarConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ActualizarConexionActionPerformed(evt);
            }
        });

        jLab_EstadoInternet.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLab_EstadoInternet.setForeground(new java.awt.Color(255, 255, 255));

        jTF_Adjunto.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Asunto:");

        jLabEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSTANT PANDA MAIL");
        jLabel1.setOpaque(true);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/panda2.jpg"))); // NOI18N

        jButCCO.setBackground(new java.awt.Color(255, 0, 0));
        jButCCO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButCCO.setForeground(new java.awt.Color(255, 255, 255));
        jButCCO.setText("Acerca de CC/CCO");
        jButCCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCCOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButCCO)
                                .addGap(18, 18, 18)
                                .addComponent(jBut_ActualizarConexion)
                                .addGap(81, 81, 81))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBut_Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBut_Descartar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBut_Adjuntar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Adjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBut_CerrarSesion))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTF_Destinatario)
                                .addComponent(jTF_Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBut_ActualizarConexion)
                            .addComponent(jButCCO)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jBut_Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBut_Descartar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBut_Adjuntar)
                    .addComponent(jTF_Adjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_DestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_DestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_DestinatarioActionPerformed

    private void jBut_AdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AdjuntarActionPerformed
        //Utilizamos JFileChooser para buscar nuestro documento a enviar
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            archivo = fc.getSelectedFile().getPath();
            nombre = fc.getSelectedFile().getName();
            jTF_Adjunto.setText(archivo);
        }
    }//GEN-LAST:event_jBut_AdjuntarActionPerformed

    private void jBut_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CerrarSesionActionPerformed
        //Cierra el frame de crear mensaje y abre uno nuevo de login
        this.dispose();
        Login ventana = new Login();     
        ventana.setVisible(true);
    }//GEN-LAST:event_jBut_CerrarSesionActionPerformed

    private void jBut_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_EnviarActionPerformed
        jBut_ActualizarConexion.doClick();
             
        if(conexion == true){
            if(jTF_Destinatario.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No ha agregado el destinatario");
            }
            else{
                int valor = 5;
                if(jTF_Asunto.getText().equals("")){
                    valor = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea enviar el correo sin asunto?");
                }
                if(valor == 5 || valor == 0){
                    EnviarMail obj = new EnviarMail(correo, contraseña, jTF_Destinatario, jTF_Asunto, jTF_Adjunto, jTA_Mensaje, nombre, jLabEstado);
                    obj.start();
                    obj = null;
                }
            } 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Intenta: \n      -Comprobar los cables de red, el módem y el router \n      -Volver a conectarte a Wi-Fi" , "Sin internet", JOptionPane.PLAIN_MESSAGE);
            
        }
        
    }//GEN-LAST:event_jBut_EnviarActionPerformed

    private void jBut_ActualizarConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ActualizarConexionActionPerformed
        verificarConexion();
    }//GEN-LAST:event_jBut_ActualizarConexionActionPerformed

    private void jBut_DescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_DescartarActionPerformed
        //Limpia los text field
        jTF_Destinatario.setText("");
        jTF_Asunto.setText("");
        jTA_Mensaje.setText("");
        jTF_Adjunto.setText("");
    }//GEN-LAST:event_jBut_DescartarActionPerformed

    private void jButCCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCCOActionPerformed
        JOptionPane.showMessageDialog(null, "Para envío Con Copia a varios destinatarios"
                + " usar \",\" (coma) después de cada correo electrónico sin espacios"
                + "\nPara envio Con Copia Oculta agregar \";\" (punto y coma) despúes de cada correo electrónico sin espacios");
    }//GEN-LAST:event_jButCCOActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButCCO;
    private javax.swing.JButton jBut_ActualizarConexion;
    private javax.swing.JButton jBut_Adjuntar;
    private javax.swing.JButton jBut_CerrarSesion;
    private javax.swing.JButton jBut_Descartar;
    private javax.swing.JButton jBut_Enviar;
    private javax.swing.JLabel jLabEstado;
    private javax.swing.JLabel jLab_EstadoInternet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTA_Mensaje;
    private javax.swing.JTextField jTF_Adjunto;
    private static javax.swing.JTextField jTF_Asunto;
    private static javax.swing.JTextField jTF_Destinatario;
    // End of variables declaration//GEN-END:variables
}

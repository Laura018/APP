/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasGeneral;

import DBConnection.CaException;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DAOs.Mensajeria;
import logica.Mensajero;
import logica.Persona;
import logica.Telefono;


/**
 *
 * @author Julian
 */
public class RegistroMensajero extends javax.swing.JDialog {

    InicioSesion is;

    /**
     * Creates new form Registrae
     */
    public RegistroMensajero(java.awt.Frame parent, String title) {
        super(parent, title);
        initComponents();
        
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        AWTUtilities.setWindowShape(this, forma);

    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextFieldPrimNom = new javax.swing.JTextField();
        PrimerNombre = new javax.swing.JLabel();
        SegundoNombre = new javax.swing.JLabel();
        TextFieldSegNom = new javax.swing.JTextField();
        TipoDeId = new javax.swing.JLabel();
        jComboBoxTipoId = new javax.swing.JComboBox<>();
        NumeroDeId = new javax.swing.JLabel();
        TextFieldNumId = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        TextFieldCorreo = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        TextFieldNacionalidad = new javax.swing.JTextField();
        ButtonRegistrarmeMensajero = new javax.swing.JButton();
        PrimerApellido = new javax.swing.JLabel();
        SegundoApellido = new javax.swing.JLabel();
        TextFieldPrimApe = new javax.swing.JTextField();
        TextFieldSegApe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ComboGenero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        JDate = new com.toedter.calendar.JDateChooser();
        label1 = new java.awt.Label();
        ComboTipoTransporte = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ComboCapacidadTransporte = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ComboCotiza = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ButtonRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(TextFieldPrimNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 155, -1));

        PrimerNombre.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        PrimerNombre.setForeground(new java.awt.Color(255, 255, 255));
        PrimerNombre.setText("Primer Nombre");
        jPanel1.add(PrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        SegundoNombre.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        SegundoNombre.setForeground(new java.awt.Color(255, 255, 255));
        SegundoNombre.setText("Segundo Nombre");
        jPanel1.add(SegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(TextFieldSegNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 155, -1));

        TipoDeId.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        TipoDeId.setForeground(new java.awt.Color(255, 255, 255));
        TipoDeId.setText("Tipo de Id");
        jPanel1.add(TipoDeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jComboBoxTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI" }));
        jComboBoxTipoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoIdActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 70, -1));

        NumeroDeId.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        NumeroDeId.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDeId.setText("Numero de Id");
        jPanel1.add(NumeroDeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));
        jPanel1.add(TextFieldNumId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 155, -1));

        Correo.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        Correo.setForeground(new java.awt.Color(255, 255, 255));
        Correo.setText("Correo");
        jPanel1.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));
        jPanel1.add(TextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 155, -1));

        Direccion.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setText("Nacionalidad");
        jPanel1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        TextFieldNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNacionalidadActionPerformed(evt);
            }
        });
        jPanel1.add(TextFieldNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 155, -1));

        ButtonRegistrarmeMensajero.setBackground(new java.awt.Color(0, 0, 0));
        ButtonRegistrarmeMensajero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonRegistrarmeMensajero.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRegistrarmeMensajero.setText("Registrarme");
        ButtonRegistrarmeMensajero.setOpaque(false);
        ButtonRegistrarmeMensajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarmeMensajeroActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegistrarmeMensajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 150, 30));

        PrimerApellido.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        PrimerApellido.setForeground(new java.awt.Color(255, 255, 255));
        PrimerApellido.setText("Primer Apellido");
        jPanel1.add(PrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        SegundoApellido.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        SegundoApellido.setForeground(new java.awt.Color(255, 255, 255));
        SegundoApellido.setText("Segundo Apellido");
        jPanel1.add(SegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jPanel1.add(TextFieldPrimApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 155, -1));
        jPanel1.add(TextFieldSegApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 155, -1));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sexo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        ComboGenero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        jPanel1.add(ComboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de nacimiento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        JDate.setPreferredSize(new java.awt.Dimension(80, 20));
        jPanel1.add(JDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 140, -1));

        label1.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Tipo de transporte");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        ComboTipoTransporte.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboTipoTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicleta", "Bicicleta" }));
        jPanel1.add(ComboTipoTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacidad de transporte");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        ComboCapacidadTransporte.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboCapacidadTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Documento", "Pequeno", "Mediano", "Grande" }));
        jPanel1.add(ComboCapacidadTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        ComboCotiza.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboCotiza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jPanel1.add(ComboCotiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FMT.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel6)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        ButtonRegresar.setBackground(new java.awt.Color(0, 0, 0));
        ButtonRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRegresar.setText("Regresar");
        ButtonRegresar.setOpaque(false);
        ButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 150, 30));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Cotiza seguridad social?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        TextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(TextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 155, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoIdActionPerformed

    }//GEN-LAST:event_jComboBoxTipoIdActionPerformed

    private void TextFieldNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNacionalidadActionPerformed

    private void ButtonRegistrarmeMensajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarmeMensajeroActionPerformed
    

        if (!TextFieldPrimNom.getText().isEmpty() && !TextFieldPrimApe.getText().isEmpty()
                && !TextFieldNumId.getText().isEmpty() && !TextFieldCorreo.getText().isEmpty()) {

            try {
                Mensajeria mens = new Mensajeria();
                Persona person = mens.getPersona();
                Mensajero mensajero = mens.getMensajero();
                Telefono telefono = mens.getTelefono();

                String tipoId = jComboBoxTipoId.getSelectedItem().toString();
                long numeroId = Long.parseLong(TextFieldNumId.getText());
                person.setN_rol("Mensajero");
                person.setN_primer_nombre(TextFieldPrimNom.getText());
                person.setN_segundo_nombre(TextFieldSegNom.getText());
                person.setN_primer_apellido(TextFieldPrimApe.getText());
                person.setN_segundo_apellido(TextFieldSegApe.getText());
                person.setO_correo(TextFieldCorreo.getText());

                //PARA PERSONA
                person.setK_tipo_id(tipoId);
                person.setK_numero_id(numeroId);
                
                java.sql.Date sqlDate = convert(JDate.getDate());
                //PARA MENSAJERO
                
                String cotizaSeguridad = ComboCotiza.getSelectedItem().toString();
                mensajero.setK_tipo_id_mensajero(tipoId);
                mensajero.setK_numero_id_mensajero(numeroId);
                mensajero.setNacionalidad(TextFieldNacionalidad.getText());
                mensajero.setF_fecha_de_nacimiento(sqlDate);
                mensajero.setI_sexo(ComboGenero.getSelectedItem().toString());
                if ("SI".equals(cotizaSeguridad)){
                    mensajero.setI_coriza_seguridad("V");
                } else{
                    mensajero.setI_coriza_seguridad("F");
                }
                mensajero.setN_tipo_de_transporte(ComboTipoTransporte.getSelectedItem().toString());
                mensajero.setN_capacidad_de_transporte(ComboCapacidadTransporte.getSelectedItem().toString());
                mensajero.setV_calificacion_prom(0);
                
                telefono.setK_tipo_id(tipoId);
                telefono.setK_numero_id(numeroId);
                telefono.setTelefono(Long.parseLong(TextTelefono.getText()));
                
                mens.IncluirPersona();
                mens.IncluirMensajero();
                mens.IncluirTelefono();
                JOptionPane.showMessageDialog(null, "Fué Registrado con éxito");

                

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa un numero de identificación valido.");
            } catch (CaException ex) {
                Logger.getLogger(RegistroMensajero.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hay campos obligatorios que tienes que llenar.");
        }

    }//GEN-LAST:event_ButtonRegistrarmeMensajeroActionPerformed

    private void ButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        InicioSesion inicio = new InicioSesion();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
    }//GEN-LAST:event_ButtonRegresarActionPerformed

    private void TextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelefonoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegistrarmeMensajero;
    private javax.swing.JButton ButtonRegresar;
    private javax.swing.JComboBox<String> ComboCapacidadTransporte;
    private javax.swing.JComboBox<String> ComboCotiza;
    private javax.swing.JComboBox<String> ComboGenero;
    private javax.swing.JComboBox<String> ComboTipoTransporte;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private com.toedter.calendar.JDateChooser JDate;
    private javax.swing.JLabel NumeroDeId;
    private javax.swing.JLabel PrimerApellido;
    private javax.swing.JLabel PrimerNombre;
    private javax.swing.JLabel SegundoApellido;
    private javax.swing.JLabel SegundoNombre;
    private javax.swing.JTextField TextFieldCorreo;
    private javax.swing.JTextField TextFieldNacionalidad;
    private javax.swing.JTextField TextFieldNumId;
    private javax.swing.JTextField TextFieldPrimApe;
    private javax.swing.JTextField TextFieldPrimNom;
    private javax.swing.JTextField TextFieldSegApe;
    private javax.swing.JTextField TextFieldSegNom;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel TipoDeId;
    private javax.swing.JComboBox<String> jComboBoxTipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    
        private static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
    
}

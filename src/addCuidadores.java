/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ozilb
 */
public class addCuidadores extends javax.swing.JFrame {

    /**
     * Creates new form addCuidadores
     */
    public addCuidadores() {
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

        Capa0 = new javax.swing.JPanel();
        TituloPagina = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        recogeNombre = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        recogeApellidos = new javax.swing.JTextField();
        numeroCuidador = new javax.swing.JLabel();
        recogeNumeroCuidador = new javax.swing.JTextField();
        Especialidad = new javax.swing.JLabel();
        Especialidades = new javax.swing.JComboBox<>();
        ADD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        Capa0.setBackground(new java.awt.Color(155, 207, 232));
        Capa0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloPagina.setBackground(new java.awt.Color(255, 255, 255));
        TituloPagina.setFont(new java.awt.Font("Skygraze", 0, 24)); // NOI18N
        TituloPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPagina.setText("añadir cuidador");
        Capa0.add(TituloPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 110));

        Nombre.setFont(new java.awt.Font("Skygraze", 0, 14)); // NOI18N
        Nombre.setText("NOMBRE");
        Capa0.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, 60));
        Capa0.add(recogeNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 460, 60));

        Apellidos.setFont(new java.awt.Font("Skygraze", 0, 14)); // NOI18N
        Apellidos.setText("apellidos");
        Capa0.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, 60));
        Capa0.add(recogeApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 460, 60));

        numeroCuidador.setFont(new java.awt.Font("Skygraze", 0, 14)); // NOI18N
        numeroCuidador.setText("Número cuidador");
        Capa0.add(numeroCuidador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 160, 60));
        Capa0.add(recogeNumeroCuidador, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 460, 60));

        Especialidad.setFont(new java.awt.Font("Skygraze", 0, 14)); // NOI18N
        Especialidad.setText("ESPECIALIDAD");
        Capa0.add(Especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 170, 60));

        Especialidades.setFont(new java.awt.Font("Skygraze", 0, 11)); // NOI18N
        Especialidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Capa0.add(Especialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 460, 60));

        ADD.setFont(new java.awt.Font("Skygraze", 0, 11)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        ADD.setText("Añadir");
        Capa0.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 280, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Capa0, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Capa0, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCuidadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JLabel Apellidos;
    private javax.swing.JPanel Capa0;
    private javax.swing.JLabel Especialidad;
    private javax.swing.JComboBox<String> Especialidades;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel TituloPagina;
    private javax.swing.JLabel numeroCuidador;
    private javax.swing.JTextField recogeApellidos;
    private javax.swing.JTextField recogeNombre;
    private javax.swing.JTextField recogeNumeroCuidador;
    // End of variables declaration//GEN-END:variables
}

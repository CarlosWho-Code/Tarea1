//
package View;


public class GUI extends javax.swing.JFrame {


    public GUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Button_Generate = new javax.swing.JButton();
        Button_Add = new javax.swing.JButton();
        Button_Clean = new javax.swing.JButton();
        Txt_Number = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Label_Even = new javax.swing.JLabel();
        Label_Odd = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio #1");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 75, 75));
        jLabel1.setText("- Generar 20 valores ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 20, 170, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 75, 75));
        jLabel2.setText("- Ingrese 20 valores ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 170, 40);

        Button_Generate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Button_Generate.setText("Generar");
        getContentPane().add(Button_Generate);
        Button_Generate.setBounds(680, 60, 120, 40);

        Button_Add.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Button_Add.setText("Agregar");
        getContentPane().add(Button_Add);
        Button_Add.setBounds(190, 60, 80, 30);

        Button_Clean.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Button_Clean.setText("Limpiar");
        getContentPane().add(Button_Clean);
        Button_Clean.setBounds(720, 430, 110, 30);

        Txt_Number.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Txt_Number.setText("Ejemplo: 666");
        getContentPane().add(Txt_Number);
        Txt_Number.setBounds(20, 60, 160, 30);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(810, 40));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 100, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Numeros Pares");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(204, 204, 204)));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Numeros Impares");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(204, 204, 204)));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 100, 0));

        Label_Even.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_Even.setForeground(new java.awt.Color(255, 255, 153));
        Label_Even.setText("-");
        Label_Even.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Even.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel3.add(Label_Even);

        Label_Odd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Label_Odd.setForeground(new java.awt.Color(255, 255, 153));
        Label_Odd.setText("-");
        Label_Odd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Odd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel3.add(Label_Odd);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 140, 580, 320);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background_UDG.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 854, 480);

        setSize(new java.awt.Dimension(868, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Background;
    public javax.swing.JButton Button_Add;
    public javax.swing.JButton Button_Clean;
    public javax.swing.JButton Button_Generate;
    public javax.swing.JLabel Label_Even;
    public javax.swing.JLabel Label_Odd;
    public javax.swing.JTextField Txt_Number;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

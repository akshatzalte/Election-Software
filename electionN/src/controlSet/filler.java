package controlSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JTextField;


public class filler extends javax.swing.JFrame {

   
    public filler() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb = new javax.swing.JComboBox<String>();
        t11 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "std8captainboy", "std8captaingirl", "std9captainboy", "std9captaingirl", "std10captainboy", "std10captaingirl", "std11captainboy", "std11captaingirl", "headboy", "headgirl", "sportscaptainboy", "sportscaptaingirl" }));
        getContentPane().add(cb);
        cb.setBounds(175, 20, 180, 30);
        getContentPane().add(t11);
        t11.setBounds(306, 310, 150, 30);
        getContentPane().add(t1);
        t1.setBounds(80, 80, 150, 30);
        getContentPane().add(t2);
        t2.setBounds(80, 130, 150, 30);
        getContentPane().add(t3);
        t3.setBounds(80, 180, 150, 30);
        getContentPane().add(t4);
        t4.setBounds(80, 230, 150, 30);
        getContentPane().add(t5);
        t5.setBounds(80, 280, 150, 30);
        getContentPane().add(t6);
        t6.setBounds(80, 330, 150, 30);
        getContentPane().add(t7);
        t7.setBounds(310, 110, 150, 30);
        getContentPane().add(t8);
        t8.setBounds(310, 160, 150, 30);
        getContentPane().add(t9);
        t9.setBounds(310, 213, 150, 30);
        getContentPane().add(t10);
        t10.setBounds(306, 260, 150, 30);

        jLabel1.setText("11");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(272, 320, 20, 14);

        jLabel2.setText("1");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 90, 10, 14);

        jLabel3.setText("2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 10, 14);

        jLabel4.setText("3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 190, 10, 14);

        jLabel5.setText("4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 240, 10, 14);

        jLabel6.setText("5");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 290, 10, 14);

        jLabel7.setText("6");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 340, 10, 14);

        jLabel8.setText("7");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 120, 10, 14);

        jLabel9.setText("8");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 170, 10, 14);

        jLabel10.setText("9");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 221, 10, 14);

        jLabel11.setText("10");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(272, 270, 20, 14);

        jButton1.setText("Fill Table");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(235, 456, 73, 23);

        jButton2.setText("Create table (if not exists)");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(194, 405, 159, 23);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(30, 25, 127, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String table = cb.getSelectedItem().toString();
        JTextField[] list = {t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11};
        try{
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.34/dav", "root","1234");
            Statement st = conn.createStatement();
            for(int i = 0; i < 11; i++){
                if(!list[i].getText().equals("")){
                    String query = "insert into " + table + " values('" + list[i].getText() + "',0);";
                    st.executeUpdate(query);
                }
                
            }
            st.close();
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String table = cb.getSelectedItem().toString();
        try{
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.34/dav", "root","1234");
            String query = "create table if not exists " + table + "(name varchar(30),votes int(11));";
            Statement st = conn.createStatement();
            st.executeUpdate(query);
            st.close();
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        String pass = new String(password.getPassword());
        if(pass.equals("adminlog")){
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_passwordActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
// <editor-fold defaultstate="collapsed">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}

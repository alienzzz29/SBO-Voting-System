
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Predator
 */
public class NoActiveElectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form NoActiveElectionPanel
     */
    public NoActiveElectionPanel() {
        initComponents();
    }

    public JButton getBtnCheckElection() {
        return btnCheckElection;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NoActiveElectionPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCheckElection = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        NoActiveElectionPanel_Title.setPreferredSize(new java.awt.Dimension(286, 100));
        NoActiveElectionPanel_Title.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No Active Election");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 44));
        NoActiveElectionPanel_Title.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(NoActiveElectionPanel_Title, java.awt.BorderLayout.NORTH);

        btnCheckElection.setText("Check Election");
        jPanel2.add(btnCheckElection);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NoActiveElectionPanel_Title;
    private javax.swing.JButton btnCheckElection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
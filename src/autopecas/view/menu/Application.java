/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.view.menu;

import autopecas.view.menu.enums.WindowType;
import autopecas.view.panels.AdminPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Application extends javax.swing.JFrame {
    private static Application instance;
    private JMenuDinamic selected;
    private final JDialogLoading loading = new JDialogLoading(this);

    private Application() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        addKeyControllers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanelRootPane = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItem4 = new JMenuDinamic(this, WindowType.VENDA);
        jMenuItem5 = new JMenuDinamic(this, WindowType.PESQUISA);
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelRootPane.setLayout(new java.awt.BorderLayout());

        jMenuVenda.setText("Vendas");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem4.setText("Venda");
        jMenuVenda.add(jMenuItem4);

        jMenuItem5.setText("Pesquisar");
        jMenuVenda.add(jMenuItem5);

        jMenuBar1.add(jMenuVenda);

        jMenu4.setText("Administração");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRootPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRootPane, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPanel jPanelRootPane;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables

    private void addKeyControllers() {
    }

    public JMenuDinamic getSelected() {
        return selected;
    }

    public void setSelected(JMenuDinamic selected) {
        this.selected = selected;
    }

    void setApplicationPanel(final JPanel panel) {
        if (this.jPanelRootPane.getComponents().length > 0) {
            this.jPanelRootPane.getComponent(0).setVisible(false);
        }
        this.jPanelRootPane.removeAll();
        this.jPanelRootPane.add(panel, java.awt.BorderLayout.CENTER);
        final Application frame = this;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                AdminPanel admPanel = (AdminPanel) panel;
                admPanel.loadContent();
            }
        };
        
        loading.action(runnable);
        loading.setVisible(true);
        
        frame.jPanelRootPane.getRootPane().revalidate();
        frame.jPanelRootPane.getRootPane().repaint();
        panel.setVisible(true);
        frame.revalidate();
        frame.repaint();
        Logger.getLogger(frame.getClass().getSimpleName()).log(
                Level.INFO, "panel '{'{0}'}' has add", panel.toString());
    }

    public static Application getInstance() {
        return instance == null ? instance = new Application(): instance;
    }
}

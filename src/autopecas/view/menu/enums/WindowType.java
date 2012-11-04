/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.view.menu.enums;

import autopecas.view.menu.NewJPanel;
import autopecas.view.panels.JPanelVenda;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public enum WindowType {
    VENDA(JPanelVenda.class),
    PESQUISA(NewJPanel.class),
    CADASTROPRODUTO(NewJPanel.class);
    Class<? extends JPanel> destined;

    private WindowType(Class<? extends JPanel> destined) {
        this.destined = destined;
    }

    public Class<? extends JPanel> getDestined() {
        return destined;
    }
}

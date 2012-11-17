/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.view.components;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author ADMIN
 */
public class Button extends JButton {

    public Button() {
        configure();
    }

    public Button(Icon icon) {
        super(icon);
        configure();
    }

    public Button(String text) {
        super(text);
        configure();
    }

    public Button(Action a) {
        super(a);
        configure();
    }

    public Button(String text, Icon icon) {
        super(text, icon);
        configure();
    }

    private void configure() {
        setBackground(new java.awt.Color(153, 204, 255));
        setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        setForeground(new java.awt.Color(51, 51, 51));
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package autopecas.view.listeners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author luis.boch
 * @since Nov 7, 2012
 */
public class ActionListener implements java.awt.event.ActionListener{
    private Component parent;
    private static final Logger log = Logger.getLogger(ActionListener.class.getSimpleName()); 

    public ActionListener(Component parent) {
        this.parent = parent;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            doAction(e);
        } catch (Exception ex){
            log.log(Level.SEVERE, ex.getMessage(), ex);
            JOptionPane.showMessageDialog(parent, "Ops, encontramos um erro, por favor, contate o suporte!");
        }
    }
    
    public void doAction(ActionEvent e) throws Exception{
    }
}

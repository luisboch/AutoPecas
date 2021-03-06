/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.view.listeners;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class FocusListener extends AbstractEventListener 
    implements java.awt.event.FocusListener{
    
    public FocusListener(Component parent) {
        super(parent);
    }
    
    public void onFocus(FocusEvent e) throws Exception{
    }
    
    public void onBlur(FocusEvent e) throws Exception{
    }

    @Override
    public final void focusGained(FocusEvent e) {
        try{
            onFocus(e);
        } catch (Throwable ex){
            onError(e, ex);
        }
    }

    @Override
    public final void focusLost(FocusEvent e) {
         try{
            onBlur(e);
        } catch (Throwable ex){
            onError(e, ex);
        }
    }
}

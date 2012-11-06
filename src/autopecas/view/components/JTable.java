/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.view.components;

/**
 *
 * @author ADMIN
 */
public class JTable extends javax.swing.JTable{

    public JTable() {
        super();
        setDefaultRenderer(String.class, new CellRender());
        setDefaultRenderer(Integer.class, new CellRender());
        setDefaultRenderer(Float.class, new CellRender());
        setDefaultRenderer(Double.class, new CellRender());
        setDefaultRenderer(Long.class, new CellRender());
        
        getTableHeader().setFont(new java.awt.Font("Arial", 1, 14));
    }

    
}

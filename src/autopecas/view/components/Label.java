/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package autopecas.view.components;

import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author luis
 */
public class Label extends JLabel {
    private boolean autoLineBreak = false;
    
    public Label() {
    }
    public Label(boolean autoLineBreak){
    }

    public Label(Icon image) {
        super(image);
    }

    public Label(String text) {
        super(text);
    }

    public Label(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public Label(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public Label(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }
    
    public Label(Icon image,boolean autoLineBreak) {
        super(image);
        this.autoLineBreak = autoLineBreak;
    }

    public Label(String text,boolean autoLineBreak) {
        super(text);
        this.autoLineBreak = autoLineBreak;
    }

    public Label(Icon image, int horizontalAlignment,boolean autoLineBreak) {
        super(image, horizontalAlignment);
        this.autoLineBreak = autoLineBreak;
    }

    public Label(String text, int horizontalAlignment, boolean autoLineBreak) {
        super(text, horizontalAlignment);
        this.autoLineBreak = autoLineBreak;
    }

    public Label(String text, Icon icon, int horizontalAlignment, boolean autoLineBreak) {
        super(text, icon, horizontalAlignment);
        this.autoLineBreak = autoLineBreak;
    }

    @Override
    public void setText(String text) {
        if(!autoLineBreak){
            super.setText(text);
            return;
        }
        // controla a quebra de linha
        StringBuilder b = new StringBuilder("<html>"); 
        if(text.length() > 100){
            int index = -1;
            int beginIndex = 0;
            while((index = text.indexOf(" ", 100)) != -1) {
                b.append(text.substring(beginIndex, index)).append("<br />");
                beginIndex = index;
            }
            
            b.append(text.substring(beginIndex)).append("<br />");
            b.append("</html>");
            super.setText(b.toString());
        }
    }
    
    
    
    
}

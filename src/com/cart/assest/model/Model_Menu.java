
package com.cart.assest.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {

    public Model_Menu(String string, String string0, Menutype menutype) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menutype getType() {
        return type;
    }

    public void setType(Menutype type) {
        this.type = type;
    }
    String icon;
    String name;
    Menutype type;
    
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/com/icon/"+icon+".png"));
    }
    
    public static enum Menutype {
        TITLE, MENU, EMPTY
    }
    
}

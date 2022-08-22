package SchoolSystem;

import javax.swing.*;

public class Menu {
    static private JFrame menu = new JFrame();
    static private JButton seeStudents = new JButton();
    static private JButton seeEmployees = new JButton();
    static private JButton addRemoveStudents = new JButton();
    static private JButton addRemoveEmployees = new JButton();

    public static void main(String[] args) {
        usedFunctions();
        menu.setVisible(true);
    }
    public static void usedFunctions(){
        setSizeMenu();
        setTitleMenu();
        setSizeButtons();
        setUnresizableMenu();
        setLocationMenu();
    }

    protected static void setSizeMenu(){
        int width, height;
        width = 400;
        height = 400;
        menu.setSize(width, height);
    }
    protected static void setTitleMenu(){
        menu.setTitle("School System");
    }
    protected static void setUnresizableMenu(){
        menu.setResizable(false);
    }
    protected static void setLocationMenu(){
        menu.setLocationRelativeTo(null);
    }
    protected static void setSizeButtons(){
        int width = 60, height = 60;
        seeStudents.setSize(width, height);
        seeEmployees.setSize(width, height);
        addRemoveStudents.setSize(width, height);
        addRemoveEmployees.setSize(width, height);
    }
}

package javaEveryday.com.DW;
import javax.swing.*;
public class OptionPaneExample {
    JFrame f;
    OptionPaneExample(){
        f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"Enter Name");
        JOptionPane.showMessageDialog(f,name);
    }
    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
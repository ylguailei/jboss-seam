package org.jboss.seam.example.pdf;

import java.awt.*;
import javax.swing.*;

import org.jboss.seam.annotations.Create;
import org.jboss.seam.annotations.Name;

@Name("swing")
public class SwingComponent
{
    @Create
    public void init() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch(Exception e) {
            System.out.println("Error setting Java LAF: " + e);
        }
        
        System.out.println("** " + UIManager.getLookAndFeel());
    }
    
    public Component getButton() {
        JLabel label = new JLabel("Hello, Seam", SwingConstants.CENTER);

        return label;        
    }

}
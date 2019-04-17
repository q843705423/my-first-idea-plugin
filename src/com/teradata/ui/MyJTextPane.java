package com.teradata.ui;

import javax.swing.*;
import java.awt.*;

public class MyJTextPane extends JTextPane {
    public MyJTextPane() {

        JButton centerButton = new JButton("ok");
        centerButton.setLocation(new Point(200,200));
        this.add(centerButton);

        JButton cancelButton= new JButton("cancel");
        centerButton.setLocation(new Point(200,200));
        this.add(cancelButton);
    }
}

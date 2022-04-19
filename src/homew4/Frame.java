package homew4;


import javax.swing.*;
import java.awt.*;


class Frame extends JFrame {

    Frame() {
        setTitle("Chat");
        setSize(new Dimension(400, 500));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       TextPanel bigTextPanel = new TextPanel();
        SendPanel sendPanel = new SendPanel(bigTextPanel.getTextArea());

        add(bigTextPanel, BorderLayout.CENTER);
        add(sendPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
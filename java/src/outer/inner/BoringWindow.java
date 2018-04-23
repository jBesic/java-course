package outer.inner;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BoringWindow {

    public void run() {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setLocation(100, 100);
        window.setTitle("This is my first Java window");

        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText("Hm...  this is a new label");
        label.setBorder(new LineBorder(Color.BLACK));
        panel.add(label);

        Container container = window.getContentPane();
        container.add(panel);

        window.setVisible(true);
    }
}
